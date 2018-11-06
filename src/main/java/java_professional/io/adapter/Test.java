package java_professional.io.adapter;

public class Test {
    public static void main(String[] args) {
        byte[] bytes = {12, 43, 112, 34, 12, 44, 65};

        MyInputStream myInputStream = new MyByteArrayInputStream(bytes);

        while (myInputStream.available() > 0) {
            int aByte = myInputStream.read();
            System.out.println(aByte);
        }
    }
}
