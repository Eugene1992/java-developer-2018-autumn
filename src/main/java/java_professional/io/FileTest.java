package java_professional.io;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Evgeniy\\Desktop\\Новая папка\\java-developer-2018-autumn\\src\\main\\java\\java_professional\\io\\from.txt");
        File dir = new File("C:\\Users\\Evgeniy\\Desktop\\Новая папка\\java-developer-2018-autumn\\src\\main\\java\\java_professional\\io\\dir");
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Is file: " + file.isFile());

        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File aFile : files) {
                System.out.println(aFile.getName());
            }
        }
    }
}
