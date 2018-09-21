import static java.lang.Math.min;

public class MaxSubString {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "worship hell";
        System.out.println("First string = " + str1);
        System.out.println("Second string = " + str2);

        String maxSubString = maxSubString(str1, str2);
        System.out.println("Max substring:");

        if (maxSubString.equals("")){
            System.out.println("Equals substrings are not found.");
        } else {
            System.out.println(maxSubString(str1, str2));
        }
    }

    static String maxSubString(String str1, String str2) {
        String newStr;
        String strLong = str1.length() > str2.length() ? str1 : str2;
        String strShort = str1.length() <= str2.length() ? str1 : str2;

        char[] charsLong = strLong.toCharArray();
        char[] charsShort = strShort.toCharArray();

        int count = 0;
        int indexFrom = 0;
        int max = 0;

        for (int i = 0; i < charsLong.length; i++) {
            int j = 0;
            while (j != charsShort.length - 1) {
                if (charsLong[i] == charsShort[j]) {
                    count = quantityEqualsChars(charsLong, charsShort, i, j, count);
                    if (count > max) {
                        max = count;
                        indexFrom = i;
                    }
                    count = 0;
                    j++;
                } else {
                    j++;
                }
            }
        }
        newStr = strLong.substring(indexFrom, indexFrom + max);

        return newStr;
    }

    static int quantityEqualsChars(char[] chars1, char[] chars2, int posFirstStr, int posSecondStr, int max) {
        if ((posFirstStr == chars1.length) || (posSecondStr == chars2.length) || (chars1[posFirstStr] != chars2[posSecondStr])) {
            return max;
        } else {
            return quantityEqualsChars(chars1, chars2, posFirstStr + 1, posSecondStr + 1, max + 1);
        }
    }
}
