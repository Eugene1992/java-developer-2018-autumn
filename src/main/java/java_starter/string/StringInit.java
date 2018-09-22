package java_starter.string;

public class StringInit {
    public static void main(String[] args) {
        String s1 = "Hello world!";
        String s2 = new String("Hello world!");
        String s3 = s1.concat("!!");
        String s4 = s1 + "!!";
        String s5 = "Hi" + false + 1 + new int[]{1, 2, 3} + 10.0;

        System.out.println(s5);
    }
}
