package homework;

public class HW05 {
    public static void main(String[] args) {
        String str = "   Hello   world   ";
        String substring = "world";
        int[] arr = new int[]{1, 3, 4, 5};

        System.out.println("Trim : " + trim(str));
        System.out.println("Absolute trim : " + trimAll(str));
        System.out.println("Index of 'l' = " + indexOf(str, 'l'));
        System.out.println("Index of 'a' = " + indexOf(str, 'a'));
        System.out.println("Last index of 'l' = " + lastIndexOf(str, 'l'));
        System.out.println("Contains : " + contains(str, substring));
        System.out.println("To String : " + toString(arr));
        System.out.println("Replace all : " + replaceAll(str, substring, "hi"));
    }

    /**
     * - trim
     */
    static String trim(String str) {
        char[] chars = str.toCharArray();

        int i = 0;
        while (chars[i] == ' ') {
            i++;
        }

        int j = chars.length - 1;
        while (chars[j] == ' ') {
            j--;
        }

        return str.substring(i, j + 1);
    }

    /**
     * - trim (обрезать и внутринние) "   Hello   world   " -> "Hello world"
     */
    static String trimAll(String str) {
        String[] newStrs = str.split("  ");

        String newStr = "";
        for (int i = 0; i < newStrs.length; i++) {
            if (!newStrs[i].equals("  ")) {
                newStr += newStrs[i];
            }
        }
        return trim(newStr);
    }

    /**
     * - indexOf (от)
     */
    static int indexOfFrom(String str, char ch, int indexFrom) {
        char[] chars = str.toCharArray();

        for (; indexFrom < chars.length; indexFrom++) {
            if (chars[indexFrom] == ch) {
                return indexFrom;
            }
        }

        return -1;
    }

    /**
     * - indexOf
     */
    static int indexOf(String str, char ch) {
        return indexOfFrom(str, ch, 0);
    }

    /**
     * - lastIndexOf
     */
    static int lastIndexOf(String str, char ch) {
        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ch) {
                return i;
            }
        }

        return -1;
    }

    /**
     * - contains (от)
     */
    static boolean containsFrom(String str, String substring, int indexFrom) {
        char[] strChars = str.toCharArray();
        char[] substringChars = substring.toCharArray();

        if (strChars.length < substringChars.length) {
            return false;
        } else {
            for (; indexFrom < strChars.length; indexFrom++) {
                if (strChars[indexFrom] == substringChars[0]) {
                    int k = indexFrom;
                    int j = 0;

                    while ((k < strChars.length) && (j < substringChars.length) && (strChars[k] == substringChars[j])) {
                        k++;
                        j++;
                    }

                    if (j == substringChars.length) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * - contains
     */
    static boolean contains(String str, String substring) {
        return containsFrom(str, substring, 0);
    }

    /**
     * - toString(int[] arr) new int[]{1, 3, 4, 5} -> "[1, 3, 4, 5]"
     */
    static String toString(int[] arr) {
        String str = "[";

        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }

        return str + arr[arr.length - 1] + "]";
    }

    /**
     * - replaceAll
     */
    static String replaceAll(String str, String strReplace, String strInsert) {
        if (!contains(str, strReplace)) {
            return str;
        } else {
            char[] strChars = str.toCharArray();
            char[] strReplaceChars = strReplace.toCharArray();
            String newStr = "";

            for (int i = 0; i < strChars.length; i++) {
                if (strChars[i] == strReplaceChars[0]) {
                    int k = i;
                    int j = 0;
                    while ((k < strChars.length) && (j < strReplaceChars.length) && (strChars[k] == strReplaceChars[j])) {
                        k++;
                        j++;
                    }

                    if (j == strReplaceChars.length) {
                        newStr += strInsert;
                        i += j;
                    }
                } else {
                    newStr += strChars[i];
                }
            }
            return newStr;
        }
    }
}
