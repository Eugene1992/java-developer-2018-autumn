package java_professional.serialization;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Point ts = new Point("10", 4);
        oos.writeObject(ts);
        oos.flush();
        oos.close();

        FileInputStream fileInputStream = new FileInputStream("temp.out");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Point o = (Point) inputStream.readObject();

        System.out.println(o);
    }
}
