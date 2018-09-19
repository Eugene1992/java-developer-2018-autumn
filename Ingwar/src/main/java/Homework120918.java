import java.util.Scanner;

public class Homework120918 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности
        // 1000 1003 1006 1009 1012 1015 ….
        for (int number = 1000; number < 10000; number = number + 3) {
            System.out.println(number);
        }

        //2. Создайте программу, выводящую на экран первые 55 элементов последовательности
        // 1 3 5 7 9 11 13 15 17 ….
        int number = 1;
        for (int count = 1; count <= 55; count++) {
            System.out.println(number);
            number = number + 2;
        }

        //3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности
        // 90 85 80 75 70 65 60 ….
        int backNumber = 90;
        while (backNumber >= 0) {
            System.out.println(backNumber);
            backNumber = backNumber - 5;
        }

        //4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        for (int count = 1; count <= 20; count++) {
            System.out.println((int) Math.pow(2, count));
        }

        //5. Выведите на экран первые 20 членов последовательности Фибоначчи.
        int beforeNumber = 0;
        int tempNumber;
        int afterNumber = 1;
        System.out.println(beforeNumber);
        System.out.println(afterNumber);
        for (int count = 1; count < 19; count++) {
            tempNumber = afterNumber;
            afterNumber = beforeNumber + tempNumber;
            beforeNumber = tempNumber;
            System.out.println(afterNumber);
        }

        //7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
        System.out.println("Input integer number");
        int intNumber = scan.nextInt();
        int startNumber = 1;
        for (int count = 1; count <= intNumber; count++) {
            startNumber = startNumber * count;
        }
        System.out.println(intNumber + "! = " + startNumber);

        //8. Выведите на экран все положительные делители натурального числа, введенного пользователем.
        System.out.println(" );
        int intNumberDivide = scan.nextInt();
        if (intNumberDivide <= 0) {
            System.out.println("Number below zero!");
        } else {
            System.out.println("Natural dividers are:");
            for (int count = 1; count <= intNumberDivide; count++) {
                if (intNumberDivide % count == 0) {
                    System.out.println(count);
                }
            }
        }

    }

}
