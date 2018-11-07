package java_professional.homeworks.homework05;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Character character = new Character("Элейн","ельф",1000);
        System.out.println(toJson(character));
    }


    public static String toJson(Object elem){
        String result = "";
        Class aClass = elem.getClass();
        if (aClass.isAnnotationPresent(JsonEntity.class)) {
            JsonEntity annotation = (JsonEntity) aClass.getAnnotation(JsonEntity.class);
            
        }
        Field[] fields = elem.getClass().getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            result += field.getName();
        }
        return result;
    }
}
