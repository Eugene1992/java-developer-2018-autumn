package java_essential.polymorphism;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void speak() {
        System.out.println("Hello, i'm animal " + name);
    }

    public static void main(String[] args) {

    }

    static String maxString(String str1, String str2) {
        String biggerString = str1.length() > str2.length() ? str1 : str2;;
        String lessString = str1.length() > str2.length() ? str2 : str1;;
        String outputString = "";
        int subStringLength = 0;
        for (int i = 0; i < lessString.length(); i++) {
            for (int j = i; j < lessString.length(); j++) {
                String maxString = subStringFromTo(lessString, i, j);
                subStringLength = maxString.length();
                if (contains(biggerString, maxString) && subStringLength <= biggerString.length()) {
                    outputString = maxString;
                } else {
                    continue;
                }
            }
        }
        return outputString;
    }
}
