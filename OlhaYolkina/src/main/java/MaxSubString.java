import static java.lang.Math.max;

public class MaxSubString {
    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = "Zellion";

        System.out.println(maxSubString(str1, str2));
    }

    static String maxSubString(String str1, String str2) {
        String newStr = "";
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        int count = 0;
        int indexFrom = -1;
        int max = 0;

        if (str1.length() > str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                int j = 0;
                while (!(j == chars2.length - 1)) {
                    if (chars1[i] == chars2[j]) {
                        count = quantityEqualsChars(chars1, chars2, i, j, count);
                        if (count > max) {
                            max = count;
                            indexFrom = i;
                        }
                        count = 0;
                    } else {
                        j++;
                    }
                }
            }
        } else {

        }

        newStr = str1.substring(indexFrom, indexFrom + max);

        return newStr;
    }

    static int quantityEqualsChars(char[] chars1, char[] chars2, int posFirstStr, int posSecondStr, int max) {
        if (chars1[posFirstStr] != chars2[posSecondStr]) {
            return max;
        }
        else {
            return quantityEqualsChars(chars1, chars2, posFirstStr + 1, posSecondStr + 1, max + 1);
        }
    }
}
