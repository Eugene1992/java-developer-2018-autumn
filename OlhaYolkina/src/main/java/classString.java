import java.util.Random;

public class classString {
    public static void main(String[] args) {
        String str = new String("Hi! My name is Olga!");
        Random random = new Random();
        int indexFrom = random.nextInt(str.length());
        int indexTo = random.nextInt(str.length());

        System.out.println("First position - " + indexFrom + " Second position - " + indexTo);
        System.out.println(subString(str, indexFrom, indexTo));
    }

    static String subString(String str, int indexFrom, int indexTo) {
        String newStr = "";
        char[] chars = str.toCharArray();

        if (indexTo >= indexFrom) {
            for (int i = indexFrom; i <= indexTo; i++) {
                newStr += chars[i];
            }
        } else {
            System.out.println("indexTo < indexFrom");
        }

        return newStr;
    }

    static String subString(String str, int indexFrom) {
        return subString(str, indexFrom, str.length() - 1);
    }

    static String subString(int indexTo, String str) {
        return subString(str, 0, indexTo);
    }
}
