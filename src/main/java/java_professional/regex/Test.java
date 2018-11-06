package java_professional.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

//        Pattern pattern = Pattern.compile("[\\w\\s]{2,5}"); // [a-zA-Z0-9_]
//        deyneko55@gmail.com
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{3,20}@[a-z]{2,5}(.[a-z]{2,3}){1,2}");

        Matcher matcher = pattern.matcher("deyneko55@gmail.com.ua");

        System.out.println(matcher.matches());

        String str = "Hello world! Hello Earth!";

        String[] split = str.split("\\W+");

        System.out.println(Arrays.toString(split));
    }
}
