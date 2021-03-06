package starter;

public class PrintMaximumSubstring {

    public static void main(String[] args) {
        String stringFirst = "hello world";
        String stringSecond = "worship hell";
        System.out.println("First string is " + stringFirst);
        System.out.println("Second string is " + stringSecond);
        System.out.println("Maximun substring is " + getMaximimumSubstring(stringFirst, stringSecond));
    }

    static String getMaximimumSubstring(String stringFirst, String stringSecond) {
        String maxSubstring = "";
        maxSubstring = stringFirst.length() >= stringSecond.length() ?
                findMaxSubstring(stringFirst, stringSecond) :
                findMaxSubstring(stringSecond, stringFirst);
        return maxSubstring;
    }

    static String findMaxSubstring(String stringChecked, String stringProcessed) {
        String resultSubstring = "";
        for (int index = 0; index < stringProcessed.length(); index++) {
            for (int count = stringProcessed.length() - 1; count >= index; count--) {
                resultSubstring = processString(index, count, stringChecked, stringProcessed, resultSubstring);
            }
        }
        return resultSubstring;
    }

    static String processString(int indexFrom, int indexEnd, String etalonString, String processString, String result) {
        String checkString = processString.substring(indexFrom, indexEnd);
        if (etalonString.contains(checkString) && checkString.length() > result.length()) {
            result = checkString;
        }
        return result;
    }
}
