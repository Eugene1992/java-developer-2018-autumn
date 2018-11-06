package java_professional.io;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class FileQueueSearch {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Evgeniy\\Desktop\\Новая папка\\java-developer-2018-autumn\\src\\main\\java\\java_professional\\io\\a");

        Queue<File> queue = new LinkedList<>();
        queue.add(file);

        while (!queue.isEmpty()) {
            File curFile = queue.poll();
            if (curFile.isDirectory()) {
                Collections.addAll(queue, curFile.listFiles());
            } else {
                System.out.println(curFile.getName());
            }
        }
    }
}
