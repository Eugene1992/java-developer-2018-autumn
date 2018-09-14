package homework;

public class HW02 {
    public static void main(String[] args) {
        /**
         * 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
         */
        int number1 = 1000;
        int count1 = 0;

        while (number1 < 10000) {
            System.out.print(number1 + " ");
            count1++;
            number1 += 3;

            if (count1 % 50 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        System.out.println();

        /**
         * 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
         */
        int number2 = 1;

        for (int count2 = 0; count2 < 55; count2++) {
            System.out.print(number2 + " ");
            number2 += 2;
        }

        System.out.println();
        System.out.println();

        /**
         * 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
         */
        int number3 = 90;

        while (number3 >= 0) {
            System.out.print(number3 + " ");
            number3 -= 5;
        }

        System.out.println();
        System.out.println();

        /**
         * 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
         */
        int number4 = 2;

        for (int count4 = 0; count4 < 20; count4++) {
            System.out.print(number4 + " ");
            number4 *= 2;
        }

        System.out.println();
        System.out.println();

        /**
         * 5. Выведите на экран первые 20 членов последовательности Фибоначчи.
         */
        int numberFibon1 = 1;
        int numberFibon2 = 1;

        System.out.print(numberFibon1 + " ");

        for (int count5 = 1; count5 < 20; count5++) {
            System.out.print(numberFibon1 + " ");
            numberFibon1 += numberFibon2;
            numberFibon2 = numberFibon1 - numberFibon2;
        }
    }
}
