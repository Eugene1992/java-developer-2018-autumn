package classwork05;

public class StringMethods {

    private static String subString(String str, int from, int to) {
        if (from < 0 || to > str.length() || to < from) {
            return "Ошибка ввода.";
        }
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = from; i < to; i++) {
            result += chars[i];
        }
        return result;
    }


    public static void main(String[] args) {
        String str1 = "Hello World!";
        System.out.println(subString(str1, 1, 6));

        //String str2 = "Hello, People!";
    }
}
