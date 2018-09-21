import java.util.Random;

public class classString {
    public static void main(String[] args) {
        String str = new String("Hi! My name is Olga!");
        Random random = new Random();
        int firstPosition = random.nextInt(str.length());
        int secondPosition = random.nextInt(str.length());

        System.out.println("First position - " + firstPosition + " Second position - " + secondPosition);
        System.out.println(subString(str, firstPosition, secondPosition));
    }

    static String subString(String str, int firstPosition, int secondPosition) {
        String newStr = "";
        char[] chars = str.toCharArray();

        for (int i = firstPosition; i <= secondPosition; i++){
            newStr += chars[i];
        }

        return newStr;
    }
}
