package homeWorkStart.homeWork005;

public class SubString {
    public static void main(String[] args) {
        System.out.println("От и до");
        String str1 = "Hello world!  ";
        System.out.println(substring(str1, 3, 7));
        System.out.println("");

        System.out.println("Максимальное предложение");
        String str2 = "   worship hell!";
        System.out.println(maxSubstring(str1, str2));
        System.out.println("");

        System.out.println("Обрезан по бокам");
        System.out.println(trim(str1));
        System.out.println("");

        System.out.println("toString");
        int[] array = new int[]{1, 3, 4, 5};
        System.out.println(toString(array));
        System.out.println("");

        System.out.println("Последний индекс");
        System.out.println(lastIndexOf(str1, 'l'));


    }

    static String substring(String str, int from, int to) {
        String result = "";
        char[] chars = str.toCharArray();
        if (to >= from) {
            for (int i = from; i < to; i++) {
                result += chars[i];
            }
        }
        return result;
    }

    // TODO: 23.09.2018 вывел по предложению, а не наибольшую подстроку.
    static String maxSubstring(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        String result = "";
        for (int i = 0; i < chars1.length; i++) {
            if (chars1.length > chars2.length) {
                result += chars1[i];
            }
        }
        for (int i = 0; i < chars2.length; i++) {
            if (chars2.length > chars1.length) {
                result += chars2[i];
            }
        }
        return result;
    }

    static String trim(String strTrim) {
        String trimString = "";
        char[] chars = strTrim.toCharArray();
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; chars[i] == ' '; i++) {
            firstIndex = i + 1;
        }
        for (int i = chars.length - 1; chars[i] == ' '; i--) {
            secondIndex = i - 1;
        }
        trimString = substring(strTrim, firstIndex, secondIndex + 1);
        return trimString;
    }

    static String substring(String str, int to) {
        return substring(str, 0, to);
    }

    //- toString(int[] arr) new int[]{1, 3, 4, 5} -> "[1, 3, 4, 5]"
    static String toString(int[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += (array[i] + ", ");

        }
        str = "[" + substring(str, str.length() - 2)  + "]";
        return str;
    }
    //lastIndexOf
    static int lastIndexOf (String str, char findIndex){
        char[] chars = str.toCharArray();
        int findIntIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == findIndex){
                findIntIndex = i;
            }
        }
        return findIntIndex;
    }
}

