package practice.reflectionPractice.JSONclasses;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class JSONViewModel {

    private static String setInBrackets(String string) {
        return '"' + string + '"';
    }

    public static String showAsString(String string) {
        return setInBrackets(string);
    }

//    todo need tweaks
    public static String showAsArray(String[] strings) {
        String convertedArray = "";

        for (String string : strings) {
            convertedArray += ("\n" + setInBrackets(string) + "," );
        }

        convertedArray = "[" + convertedArray.substring(0, convertedArray.length() - 1) + "\n],";

        return convertedArray;
    }

    public static String getAsValueInJSON(Object object, Field field) throws IllegalAccessException {
        String valueJSONString;
        String[] splittedTypeArray = field.getType().toString().split(" ");
        String fullType = splittedTypeArray[splittedTypeArray.length - 1];
        String[] type = fullType.split("[.]");
        String finalType = type[type.length - 1];

        field.setAccessible(true);
        if(finalType.equals("String")) {
            valueJSONString = showAsString(field.get(object).toString());
        } else {
            valueJSONString = field.get(object).toString();
        }

        return valueJSONString;
    }

//    todo
//    public static String getAsKeyValueInJSON(Object object, Field field) {
//        String keyValueJSONString;
//
//        keyValueJSONString +=
//    }
}
