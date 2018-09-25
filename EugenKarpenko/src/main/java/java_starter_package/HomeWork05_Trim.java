package java_starter_package;

public class HomeWork05_Trim {
    public static void main(String[] args) {
        String soumeString = "         Java is the best programming language!             ";
        System.out.println(trim(soumeString));
    }

    //- trim

    static String trim(String str) {
        char[] strToChar = str.toCharArray();
        int gapsBegin = 0;
        while (strToChar[gapsBegin] == ' ') {
            gapsBegin++;
        }
        int gapsEnd = strToChar.length - 1;
        while (strToChar[gapsEnd] == ' ') {
            gapsEnd--;
        }
        return str.substring(gapsBegin, gapsEnd + 1);
    }
}
