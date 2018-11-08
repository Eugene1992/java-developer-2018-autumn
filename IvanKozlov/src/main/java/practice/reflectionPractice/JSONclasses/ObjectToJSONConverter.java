package practice.reflectionPractice.JSONclasses;

import practice.reflectionPractice.JSONclasses.JSONViewModel;
import practice.reflectionPractice.annotations.AnnotationChecker;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ObjectToJSONConverter {

    private Class getObjectClass(Object objectToConvert) {
        return objectToConvert.getClass();
    }

    private Field[] getClassFields(Object objectToConvert) {
        return getObjectClass(objectToConvert).getDeclaredFields();
    }

    private ArrayList getClassFieldsList(Object objectToConvert) {
        ArrayList<String> fields = new ArrayList<>();
        Field[] allFields = getClassFields(objectToConvert);
        for (Field field : allFields) {
            fields.add(field.getName());
        }

        return fields;
    }

    private String getFieldValue(Object object, Field field) throws IllegalAccessException {
        if(Modifier.isPrivate(field.getModifiers())) {
            field.setAccessible(true);
        }

        return field.get(object).toString();
    }

    public String convertToJSON(Object objectToConvert) throws IllegalAccessException, NoSuchFieldException {
        String JSONString = "";

        if(AnnotationChecker.isJSONEntityAnnotationPresentInClass(objectToConvert)) {
            for (int i = 0; i < getClassFieldsList(objectToConvert).size(); i++) {
                Field classField = getClassFields(objectToConvert)[i];

                if(AnnotationChecker.isJSONFieldAnnotationPresentInClass(objectToConvert,classField)) {
                    if(i < getClassFieldsList(objectToConvert).size() - 1) {
                        JSONString += JSONViewModel.showAsString(classField.getName()) + " : " + JSONViewModel.getAsValueInJSON(objectToConvert, classField) + ",\n";
                    } else {
                        JSONString += JSONViewModel.showAsString(classField.getName()) + " : " + JSONViewModel.getAsValueInJSON(objectToConvert, classField) + "\n";
                    }
                }
            }
            JSONString = "{\n" + JSONString + "}";
        }

        return JSONString;
    }
}
