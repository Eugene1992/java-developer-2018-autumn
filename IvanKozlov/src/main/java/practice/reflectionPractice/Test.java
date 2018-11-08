package practice.reflectionPractice;

import practice.reflectionPractice.JSONclasses.JSONDocument;
import practice.reflectionPractice.JSONclasses.ObjectToJSONConverter;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, IOException {
        Employee employee = new Employee("John", 25, true);
        ObjectToJSONConverter objectToJSONConverter = new ObjectToJSONConverter();
        JSONDocument jsonDocument = new JSONDocument();

        jsonDocument.createJSONDocumentFromObject(employee);

        System.out.println(objectToJSONConverter.convertToJSON(employee));
    }
}
