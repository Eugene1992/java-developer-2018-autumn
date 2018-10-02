package java_starter.homework05;

import java.util.Arrays;

public class TaskFrom {
    public static void main(String[] args) {
        String str = "Method for subString    r   ";
        int[] arr = new int[]{1, 3, 4, 5};
        String str1 = "hello world";
        String str2 = "worship hell";
        System.out.println(maxString(str1, str2));
//        System.out.println(replaceAll(str, "for", "tow"));
//        System.out.print(str.length());
//        System.out.println("Chek");
    }

    //Method - subString (от и до(вклчительно))
    static String subStringFromTo(String str, int from, int to) {
        char[] forMethod = str.toCharArray();
        String forReturnMethod = "";
        for (int i = from, j = 0; i <= to; i++, j++) {
            forReturnMethod += forMethod[i];
        }
        return forReturnMethod;
    }

    //Method subStringFrom (от(вклчительно))
    static String subStringFrom(String str, int from) {
//        char[] forMethod = str.toCharArray();
//        String forReturnMethod = "";
//        for (int i = from, j = 0; i < forMethod.length; i++, j++) {
//            forReturnMethod += forMethod[i];
//        }
        return subStringFromTo(str, from, str.length());
    }

    //Method - subString (до(вклчительно))
    static String subStringTo(String str, int to) {
//        char[] forMethod = str.toCharArray();
//        String forReturnMethod = "";
//        for (int i = 0, j = 0; i <= to; i++, j++) {
//            forReturnMethod += forMethod[i];
//        }
        return subStringFromTo(str, 0, to);
    }

    //Method - trim
    static String trim(String str) {
        char[] forMethod = str.toCharArray();
        String forReturnMethod = "";
        int beginIndex = 0;
        int endIndex = forMethod.length - 1;
        for (int i = 0; forMethod[i] == ' '; i++) {
            if (forMethod[i] == ' ') {
                beginIndex = (i + 1);
            }
        }
        for (int i = (forMethod.length - 1); forMethod[i] == ' '; i--) {
            if (forMethod[i] == ' ') {
                endIndex = (i - 1);
            }
        }
        for (int i = beginIndex; i <= endIndex; i++) {
            forReturnMethod += forMethod[i];
        }
        return forReturnMethod;
    }

    //Method - trim (обрезать и внутринние) "   Hello   world   " -> "Hello world"
    static String trimAll(String str) {
        String newStr = trim(str);
        String forReturnMethod = "";
        char[] forMethod = newStr.toCharArray();
        for (int i = 0; i < forMethod.length; i++) {
            if (forMethod[i] == ' ') {
                if (forMethod[i + 1] != ' ') {
                    forReturnMethod += forMethod[i];
                }
            } else {
                forReturnMethod += forMethod[i];
            }
        }
        return forReturnMethod;
    }

    //Method - indexOf
    static int indexOf(String str, char ch) {
        int index = -1;
        char[] forMethod = str.toCharArray();
        for (int i = 0; i < forMethod.length; i++) {
            if (forMethod[i] == ch) {
                index = i;
            }
            if (index > (-1)) {
                break;
            }
        }
        return index;
    }

    //Method - indexOf (от)
    static int indexOfFrom(String str, int indexFrom, char ch) {
        char[] forMethod = str.toCharArray();
        int index = -1;
        for (int i = 0, j = indexFrom; i < forMethod.length; i++, j++) {
            if (forMethod[i] == ch) {
                index = i;
            }
            if (index > (-1)) {
                if (index < indexFrom) {
                    continue;
                }
                break;
            }
        }
        return index;
    }

    //Method - lastIndexOf
    static int lastIndexOf(String str, char ch) {
        char[] forMethod = str.toCharArray();
        int index = -1;
        for (int i = (forMethod.length - 1); i >= 0; i--) {
            if (forMethod[i] == ch) {
                index = i;
            }
            if (index > (-1)) {
                break;
            }
        }
        return index;
    }

    //Method - contains
    static boolean contains(String str, String ch) {
//        if (ch.length() <= str.length()) {
//            char[] contains = str.toCharArray();
//            char[] contains2 = ch.toCharArray();
//        }else{
//            char[] contains2 = str.toCharArray();
//            char[] contains = ch.toCharArray();
//        }
//        boolean getAnswer = false;
//        for (int i = 0; i < contains.length; i++) {
//            if (contains2[0] == contains[i]) {
//                for (int j = 1; j < contains2.length; j++) {
//                    if (contains2[j] == contains[i + 1]) {
//                        getAnswer = true;
//                        i++;
//                    } else {
//                        getAnswer = false;
//                    }
//                }
//            }
//        }
        return containsFrom(str, ch, 0);
    }

    //Method - contains (от)
    static boolean containsFrom(String str, String ch, int from) {
        char[] contains = str.toCharArray();
        char[] contains2 = ch.toCharArray();
        boolean getAnswer = false;
        for (int i = from; i < contains.length; i++) {
            if (contains2[0] == contains[i]) {
                for (int j = 1; j < contains2.length; j++) {
                    if (contains2[j] == contains[i + 1]) {
                        getAnswer = true;
                        i++;
                    } else {
                        getAnswer = false;
                    }
                }
            }
        }
        return getAnswer;
    }

    //Method - toString(int[] arr) new int[]{1, 3, 4, 5} -> "[1, 3, 4, 5]"
    static void toString(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != (arr.length - 1)) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

    //    Metod - replaceAll
    static String replaceAll(String str, String fromChange, String toChange) {
        char[] contains = str.toCharArray();
        char[] contains2 = fromChange.toCharArray();
        char[] contains3 = toChange.toCharArray();
        boolean getAnswer = false;
        int replaceIndexBegin;
        int replaceIndexEnd;
        String forReturnMethod = "";
        for (int i = 0; i < contains.length; i++) {
            if (contains2[0] == contains[i]) {
                for (int j = 1; j < contains2.length; j++) {
                    if (contains2[j] == contains[i + 1]) {
                        getAnswer = true;
                        i++;
                    } else {
                        getAnswer = false;
                    }
                }
            }
        }
        replaceIndexBegin = indexOf(str, contains2[0]);
        replaceIndexEnd = replaceIndexBegin + contains2.length;
        if (getAnswer) {
            for (int i = 0; i < replaceIndexBegin; i++) {
                forReturnMethod += contains[i];
            }
            System.out.println(forReturnMethod);
            for (int i = 0; i < contains3.length; i++) {
                forReturnMethod += contains3[i];
            }
            for (int i = replaceIndexEnd; i < contains.length; i++) {
                forReturnMethod += contains[i];
            }
        }
        return forReturnMethod;
    }

    //    Metod - maxString
    static String maxString(String str1, String str2) {
        String biggerString = str1.length() > str2.length() ? str1 : str2;
        ;
        String lessString = str1.length() > str2.length() ? str2 : str1;
        ;
        String outputString = "";
        int subStringLength = 0;
        for (int i = 0; i < lessString.length(); i++) {
            String cur = "";
            for (int j = i; j < lessString.length(); j++) {
                cur = lessString.substring(i, j);
                if (biggerString.contains(cur) && cur.length() > outputString.length()) {
                    outputString = cur;
                }
            }

        }
        return outputString;
    }

}


