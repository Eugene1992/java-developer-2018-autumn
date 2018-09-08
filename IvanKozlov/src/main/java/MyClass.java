public class MyClass {
    public static void main(String[] args) {
        int number = 13;
        int divider = 2;

        int seventhNumber = number % divider;

        int division = number / divider;

        int sixthNumber = division % divider;

        division /= divider;

        int fifthNumber = division % divider;

        division /= divider;

        int fourthNumber = division % divider;

        division /= divider;

        int thirdNumber = division % divider;

        division /= divider;

        int secondNumber = division % divider;

        division /= divider;

        int firstNumber = division % divider;

        division /= divider;

        int zeroNumber = division % divider;

        System.out.print(zeroNumber);
        System.out.print(firstNumber);
        System.out.print(secondNumber);
        System.out.print(thirdNumber);
        System.out.print(fourthNumber);
        System.out.print(fifthNumber);
        System.out.print(sixthNumber);
        System.out.print(seventhNumber);
    }
}
