package java_professional.io;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

public class CopyFileTest {
    public static void main(String[] args) throws FileNotFoundException {
        File from = new File("C:\\Users\\Evgeniy\\Desktop\\Новая папка\\java-developer-2018-autumn\\src\\main\\java\\java_professional\\io\\[ex-fs.net]_518540.torrent");
        File to = new File("C:\\Users\\Evgeniy\\Desktop\\Новая папка\\java-developer-2018-autumn\\src\\main\\java\\java_professional\\io\\[ex-fs.net]_518540_copy.torrent");

        InputStream inputStream = new FileInputStream(from);
        OutputStream outputStream = new FileOutputStream(to, true);

        ByteOutputStream byteOutputStream = new ByteOutputStream();

        byte[] bytes = byteOutputStream.getBytes();

        copy(inputStream, byteOutputStream);

        System.out.println(bytes.length);
    }

    static void copy(InputStream inputStream, OutputStream outputStream) {
        try {
            while (inputStream.available() > 0) {
                int readedByte = inputStream.read();
                outputStream.write(readedByte);
            }
            inputStream.close();
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
