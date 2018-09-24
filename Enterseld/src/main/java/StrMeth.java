public class StrMeth {
    public static void main(String[] args) {
        String str = "Hello my world!";

        char[] cha = str.toCharArray();

        //subString (от и до)

        System.out.println(str.substring(6, 8));

        //subString (от)

        System.out.println(str.substring(6, str.length()));

        //subString (до)

        System.out.println(str.substring(0, 8));

        //trim

        System.out.println("   Hello           world!        ".trim());

        //indexOf

        System.out.println(str.indexOf("d"));

        //indexOf (от)

        System.out.println(str.indexOf("r", 10));

        //lastIndexOf

        System.out.println(str.lastIndexOf("y"));

        //contains

        System.out.println(str.contains("wor"));

        //replaceAll

        System.out.println(str.replaceAll("l", "f"));
    }
}


