package homework;

import java.util.Random;

public class HW03 {
    public static void main(String[] args) {
        /**
         * 1. Вывести в консоль все парные числа одномерного массива.
         */
        Random random = new Random();
        int[] arr1 = new int[50];

        System.out.println("All:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(501);
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        System.out.println("All even:");

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.print(arr1[i] + " ");
            }
        }

        System.out.println();
        System.out.println();

        /**
         * 2. Вывести все числа одномерного массива в обратном порядке.
         */
        int[] arr2 = new int[20];

        System.out.println("Forward:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(501);
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        System.out.println("Back:");
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        System.out.println();

        /**
         * 3. Вывести первую и вторую половину одномерного массива.
         */
        int[] arr3 = new int[50];

        System.out.println("All:");
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = random.nextInt(501);
            System.out.print(arr3[i] + " ");
        }

        System.out.println();
        System.out.println("First part:");

        for (int i = 0; i < arr3.length / 2; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println();
        System.out.println("Second part:");

        for (int i = arr3.length / 2; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println();
        System.out.println();

        /**
         * 4. Вывести первую и вторую половину одномерного массива в обратном порядке.
         */
        int[] arr4 = new int[50];

        System.out.println("All:");
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = random.nextInt(501);
            System.out.print(arr4[i] + " ");
        }

        System.out.println();
        System.out.println("First part:");

        for (int i = arr4.length - 1; i >= arr4.length / 2; i--) {
            System.out.print(arr4[i] + " ");
        }

        System.out.println();
        System.out.println("Second part:");

        for (int i = arr4.length / 2 - 1; i >= 0; i--) {
            System.out.print(arr4[i] + " ");
        }

        System.out.println();
        System.out.println();

        /**
         * 5. Найти сумму всех элементов в массиве.
         * 6. Найти среднеарифметическое всех чисел массива.
         * 7. Найти минимальное и максимальное число в массиве.
         */
        int[] arr5 = new int[20];

        System.out.println("All:");
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = random.nextInt(501);
            System.out.print(arr5[i] + " ");
        }

        int sum = arr5[0];
        int max = arr5[0];
        int min = arr5[0];

        System.out.println();

        for (int i = 1; i < arr5.length; i++) {
            sum += arr5[i];
            if (arr5[i] > max) {
                max = arr5[i];
            }
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        int average = sum / arr5.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        System.out.println();
        System.out.println();
    }
}
