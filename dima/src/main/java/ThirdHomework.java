public class ThirdHomework {
    public static void main(String[] args) {
        // Задание №1//
        int firstNumber = 1000;
        System.out.println(" Первое число " + firstNumber);
        while (firstNumber < 10000) {
            System.out.println(+firstNumber);
            firstNumber += 3;
        }
        // Задание №2//
        int secondNumber = 1000;
        System.out.println(" Первое число " + secondNumber);
        while (secondNumber < (1000 + 2 * (56 - 1))) {
            System.out.println(+secondNumber);
            secondNumber += 2;
        }
        // Задание №3//
        int thirdNumber = 90;
        System.out.println(" Первое число " + thirdNumber);
        while (thirdNumber >= 0) {
            System.out.println(+thirdNumber);
            thirdNumber -= 5;
        }
        // Задание №4//
        int fourthNumber = 2;
        int b = 2;
        int stepenOne = 20;
        System.out.println(" Первое число " + fourthNumber);
        while (fourthNumber < (2 * (Math.pow(b, stepenOne)))) {
            System.out.println(+fourthNumber);
            fourthNumber *= 2;
        }


    }
}
