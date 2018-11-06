package java_professional.io.decorator;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        MyReader reader = new StringReader("Hello world!\nHello all!\n");

        BufferedStringReader bufferedStringReader = new BufferedStringReader(reader);

        System.out.println(bufferedStringReader.readLine());
        System.out.println(bufferedStringReader.readLine());
    }
}
