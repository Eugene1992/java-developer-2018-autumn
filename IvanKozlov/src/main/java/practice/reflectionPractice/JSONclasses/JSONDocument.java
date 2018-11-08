package practice.reflectionPractice.JSONclasses;

import java.io.*;

public class JSONDocument {

    private Object JSONObject;
    ObjectToJSONConverter objectToJSONConverter = new ObjectToJSONConverter();

    private final String PATH_FOR_JSON_DOCUMENT = "C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\";

    public void createJSONDocumentFromObject(Object object) throws IOException, NoSuchFieldException, IllegalAccessException {
        FileOutputStream outputStream = new FileOutputStream(PATH_FOR_JSON_DOCUMENT + object.getClass().getSimpleName() + ".json");
        byte[] JSONToBytes = objectToJSONConverter.convertToJSON(object).getBytes();
        outputStream.write(JSONToBytes);

        outputStream.close();
    }



}
