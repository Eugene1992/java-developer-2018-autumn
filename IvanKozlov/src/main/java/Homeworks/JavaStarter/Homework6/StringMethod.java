package homeworks.javaStarter.homework6;

//Реализовать методы класса String:

public class StringMethod {
    public static void main(String[] args) {

        System.out.println("subString (от и до)");
        System.out.println(substring("Hello world!", 5, 2));
        makeBlankLine();

        System.out.println("subString(до)");
        System.out.println(substring("Hello world!", 2));
        makeBlankLine();

        System.out.println("subString(от)");
        System.out.println(substring(2, "Hello world!"));
        makeBlankLine();

        System.out.println("trim");
        System.out.println(trim("         sffdsfdf        fdsfsdf      "));
        makeBlankLine();

        System.out.println("trim(обрезать и внутринние) '   Hello   world   ' ->'Hello world'");
        System.out.println(trim("         sffdsfdf        fdsfsdf      ", true));
        makeBlankLine();

        System.out.println("lastIndexOf");
        System.out.println(lastIndexOf("ababababa", 'c'));
        System.out.println(lastIndexOf("ababababa", 'a'));
        makeBlankLine();

        System.out.println("indexOf");
        System.out.println(indexOf("ababababa", 'a'));
        System.out.println(indexOf("ababababa", 'c'));
        makeBlankLine();

        System.out.println("indexOf(от)");
        System.out.println(indexOf("ababababa", 'a', 2));
        System.out.println(indexOf("ababababa", 'c', 4));
        makeBlankLine();

        System.out.println("contains");
        System.out.println(contains("Hello World", "ld"));
        makeBlankLine();

        System.out.println("contains(от)");
        System.out.println(contains("Hello World", "lo W", 1));
        makeBlankLine();

        System.out.println("toString( int[] arr)new int[]{1, 3, 4, 5} ->'[1, 3, 4, 5]'");
        int[] array = new int[]{1, 3, 4, 5};
        System.out.println(toString(array));
        makeBlankLine();

        System.out.println("replaceAll");
        System.out.println(replaceAll("hello,   lolo, llo, llo", "lo"));
        makeBlankLine();

        System.out.println("sdsdsad hello fasdfas".contains("hello"));
        System.out.println(getLongesSubString("hello asdsdasdasdasdasd world", "hells asdsdasdasdasdasd bells"));

    }

    static void makeBlankLine() {
        System.out.print("\n");
    }

//        - subString (от и до)

    static String substring(String str, int from, int to) {
        String editedString = "";
        char[] stringToCharArray = str.toCharArray();
        int buffer;

        if (from > to) {
            buffer = from;
            from = to;
            to = buffer;
        }

        if (to <= stringToCharArray.length && from >= 0) {
            for (int i = from; i < to; i++) {
                editedString += str.toCharArray()[i];
            }
        } else {
            System.out.println("Out of boundary");
        }

        return editedString;
    }

//        - subString (от)

    static String substring(int from, String str) {
        return substring(str, from, str.toCharArray().length);
    }

//        - subString (до)

    static String substring(String str, int to) {
        return substring(str, 0, to);
    }

//        - trim (обрезать и внутринние) "   Hello   world   " -> "Hello world"

    static String trim(String string, Boolean removeNotNeededSpacesInside) {
        String trimmedString = trim(string);
        String trimmedInsideString = "";
        char[] arrayFromString = trimmedString.toCharArray();

        if (removeNotNeededSpacesInside) {
            for (int i = 0; i < arrayFromString.length; i++) {
                if (arrayFromString[i] != ' ' || ((arrayFromString[i] == ' ') && arrayFromString[i - 1] != ' ')) {
                    trimmedInsideString += arrayFromString[i];
                }
            }
        } else {
            trimmedInsideString = trimmedString;
        }
        return trimmedInsideString;
    }

//        - trim

    static String trim(String string) {
        String trimmedString = "";
        char[] arrayFromString = string.toCharArray();
        int firstCharIndex = 0;
        int lastCharIndex = 0;

        for (int i = 0; arrayFromString[i] == ' '; i++) {
            firstCharIndex = i + 1;
        }

        for (int i = arrayFromString.length - 1; arrayFromString[i] == ' '; i--) {
            lastCharIndex = i - 1;
        }

        trimmedString = substring(string, firstCharIndex, lastCharIndex + 1);

        return trimmedString;
    }

//        - lastIndexOf

    static int lastIndexOf(String string, char charToFindIndex) {
        char[] charArray = string.toCharArray();
        int indexOfCharToFind = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charToFindIndex) {
                indexOfCharToFind = i;
            } else {
                indexOfCharToFind = -1;
            }
        }
        return indexOfCharToFind;
    }

//        - indexOf

    static int indexOf(String string, char charToFindIndex) {
        return indexOf(string, charToFindIndex, 0);
    }

//        - indexOf (от)

    static int indexOf(String string, char charToFindIndex, int fromPoint) {

        char[] charArray = string.toCharArray();
        int indexOfCharToFind = -1;

        if (fromPoint < charArray.length - 1) {
            for (int i = fromPoint; i < charArray.length; i++) {
                if (charArray[i] == charToFindIndex) {
                    indexOfCharToFind = i;
                    break;
                } else {
                    indexOfCharToFind = -1;
                }
            }
        }

        return indexOfCharToFind;
    }

//        - contains

    static boolean contains(String stringContainer, String stringContained) {

        return contains(stringContainer, stringContained, 0);
    }

//        - contains (от)

    static boolean contains(String stringContainer, String stringContained, int fromPoint) {

        boolean contains = false;
        String editedString = "";
        char[] containerStringArray = stringContainer.toCharArray();
        char[] containedStringArray = stringContained.toCharArray();
        int startIndex = 0;

        if ((indexOf(stringContainer, containedStringArray[0]) != -1)
                && (indexOf(stringContainer, containedStringArray[0]) >= fromPoint)) {
            startIndex = indexOf(stringContainer, containedStringArray[0]);
        }

        editedString = substring(stringContainer, startIndex, (startIndex + containedStringArray.length));
        char[] editedStringAtrray = editedString.toCharArray();

        for (int i = 0; i < editedStringAtrray.length; i++) {
            if (editedStringAtrray[i] == containedStringArray[i]) {
                contains = true;
            } else {
                break;
            }
        }

        return contains;
    }

//        - toString(int[] arr) new int[]{1, 3, 4, 5} -> "[1, 3, 4, 5]"

    static String toString(int[] array) {
        String stringFromArray = "";
        for (int element : array) {
            stringFromArray += (element + ", ");
        }

        stringFromArray = "[" + substring(stringFromArray, stringFromArray.length() - 2) + "]";

        return stringFromArray;
    }

//        - replaceAll

    static String replaceAll(String string, String replacementString) {
        String editedString = "";
        char[] stringArray = string.toCharArray();

        int replacementStringLength = replacementString.length();

        for (int i = 0; i < string.length(); i++) {
            if (!(substring(string, i, i + replacementStringLength).equals(replacementString))) {
                editedString += stringArray[i];
            } else {
                i += replacementStringLength - 1;
            }
        }

        return editedString;
    }

//
//        Найти наибольшую подстроку из двух строк
//        "hello world" & "worship hell"->"hell"

    static String getLongesSubString(String firstString, String secondString) {
        String largestSubString = "";
        String largerString = firstString;
        String smallerString = secondString;

        if (secondString.length() > firstString.length()) {
            largerString = secondString;
            smallerString = firstString;
        }

        for (int i = 0; i < smallerString.length(); i++) {

            for (int j = smallerString.length() - 1; j > 1 && j > i; j--) {

                if (largerString.contains(smallerString.substring(i, j))
                        && smallerString.substring(i, j).length() > largestSubString.length()) {

                    largestSubString = smallerString.substring(i, j);
                }
            }
        }
        return largestSubString;
    }
}
