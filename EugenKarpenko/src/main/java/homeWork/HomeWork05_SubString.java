package homeWork;

public class HomeWork05_SubString {
    public static void main(String[] args) {
        String someString = ("Hello Word! java is the best programming language!");
        int indexFrom = 2;
        int indexTo = 20;
        System.out.println("Index from = " + indexFrom + " index to = " + indexTo);
        System.out.printf("\nsubString (от и до) - ");
        System.out.println(subString(someString, indexFrom, indexTo));
        System.out.printf("\nsubString (от) - ");
        System.out.println(subString(someString, indexFrom));
        System.out.printf("\nsubString (до) - ");
        System.out.println(subString(indexTo, someString));
    }

    //- subString (от и до)

    static String subString(String str, int indexFrom, int indexTo) {
        String newString = "";
        char[] strToChar = str.toCharArray();
        if (indexTo >= indexFrom) {
            for (int i = indexFrom; i <= indexTo; i++) {
                newString += strToChar[i];
            }
        } else {
            System.out.println("indexTo > indexFrom or > array String length");
        }
        return newString;
    }

    //- subString (от)

    static String subString(String str, int indexFrom) {
        String newString = "";
        char[] strToChar = str.toCharArray();
        if (indexFrom <= strToChar.length) {
            for (int i = indexFrom; i < strToChar.length; i++) {
                newString += strToChar[i];
            }
        } else {
            System.out.println("indexFrom > array String length");
        }
        return newString;
    }

    //- subString (до)

    static String subString(int indexTo, String str) {
        String newString = "";
        char[] strToChar = str.toCharArray();
        if (indexTo <= strToChar.length) {
            for (int i = 0; i < indexTo; i++) {
                newString += strToChar[i];
            }
        } else {
            System.out.println("indexTo > array String length");
        }
        return newString;
    }
}

