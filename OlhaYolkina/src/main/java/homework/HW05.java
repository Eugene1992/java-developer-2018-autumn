package homework;

public class HW05 {
    public static void main(String[] args) {
        String str = "   Hello   world   ";
        System.out.println("Trim : " + trim(str));
        System.out.println("Absolute trim : " + trimAll(str));
        System.out.println("Index of 'l' = " + indexOf(str, 'l'));
        System.out.println("Index of 'a' = " + indexOf(str, 'a'));
        System.out.println("Last index of 'l' = " + lastIndexOf(str, 'l'));
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
}
