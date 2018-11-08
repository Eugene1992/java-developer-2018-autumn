package practice.reflectionPractice.annotations;

import homeworks.javaStarter.homework4.Array;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class AnnotationChecker {

    private static ArrayList<String> getAllClassAnnotations(Object object) {
        ArrayList<String> allClassAnnotations = new ArrayList<>();
        for(Annotation annotation : object.getClass().getAnnotations()) {
            allClassAnnotations.add(getAnnotationName(annotation.toString()));
        }

        return allClassAnnotations;
    }

    private static String getAnnotationName(String annotation) {
        String[] annotationArray = annotation.split("[.]");
        String fullAnnotation = annotationArray[annotationArray.length - 1];

        return fullAnnotation.replaceAll("[(](.*?)[)]", "");
    }

    public static boolean isJSONEntityAnnotationPresentInClass(Object object) {
        boolean isPresent = false;
        for (String annotation : getAllClassAnnotations(object)) {
            if(annotation.equals("JSONEntity")) {
                isPresent = true;
            }
        }

        return isPresent;
    }

    private static ArrayList<String> getAllFieldAnnotations(Object object, Field field) throws NoSuchFieldException {
        ArrayList<String> allFieldAnnotations = new ArrayList<>();
        field.setAccessible(true);
        for(Annotation annotation : field.getDeclaredAnnotations()) {
            allFieldAnnotations.add(getAnnotationName(annotation.toString()));
        }

        return allFieldAnnotations;
    }

    public static boolean isJSONFieldAnnotationPresentInClass(Object object, Field field) throws NoSuchFieldException {
        boolean isPresent = false;
        for (String annotation : getAllFieldAnnotations(object, field)) {
            if(annotation.equals("JSONField")) {
                isPresent = true;
            }
        }

        return isPresent;
    }
}
