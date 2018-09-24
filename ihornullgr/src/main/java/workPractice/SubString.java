package workPractice;

public class SubString {
    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = "worship hell!";
        System.out.println(substring(str1, 0, 4));
        System.out.println("");
        System.out.println(maxSubstring(str1, str2));

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
            if (chars2.length > chars1.length){
                result += chars2[i];
            }
        }
        return result;
    }
}

