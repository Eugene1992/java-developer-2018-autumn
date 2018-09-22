package java_starter.string;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello world!";

        char[] chars = str.toCharArray();

        for (char aChar : chars) {
            System.out.println(aChar);
        }

        byte[] bytes = str.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.isEmpty());
        System.out.println("".isEmpty());

        System.out.println(str.length());

        String[] split = "London is capital of a Great Britain    !".split(" ");
        System.out.println(Arrays.toString(split));

        System.out.println(str.startsWith("Hel"));
        System.out.println(str.startsWith("HellBells"));
        System.out.println(str.startsWith("llo", 2));

        System.out.println(str.endsWith("!"));

        System.out.println(str.replaceAll("world", "Earth"));

        System.out.println(str.substring(3, 6));

        System.out.println(str.contains("world"));
        System.out.println(str.contains("dummy"));

        System.out.println(str.equals("Hello world!"));
        System.out.println(str.equals("Hello wORld!"));
        System.out.println(str.equalsIgnoreCase("Hello wORld!"));

        System.out.println(str.compareTo("Hello world!"));

        System.out.println(str.indexOf("H"));
        System.out.println(str.indexOf("w"));
        System.out.println(str.indexOf("l"));

        System.out.println(str.lastIndexOf("l"));

        System.out.println("   Helllo           , man!        ".trim());
    }
}
