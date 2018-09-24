public class SubstringTest {
    public static void main(String[] args) {
        System.out.println(substring("Hellosdsd", 2, 5));
    }

    static String substring(String str, int from, int to) {
        String editedString = "";
        char[] stringToCharArray = str.toCharArray();

        if(to <= stringToCharArray.length && from >= 0) {
            for (int i = from; i < to; i++) {
                editedString += str.toCharArray()[i];
            }
        } else {
            System.out.println("Out of boundary");
        }

        return editedString;
    }
}
