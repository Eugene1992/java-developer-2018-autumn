package javaStarter.homework;

import java.util.Random;

import static java.lang.Math.min;
import static java.lang.Math.max;

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

        /**
         * 8. Заменить все отрицательные числа в массиве на 0.
         */
        int[] arr8 = new int[10];

        System.out.println("All:");
        for (int i = 0; i < arr8.length; i++) {
            arr8[i] = random.nextInt();
            System.out.print(arr8[i] + " ");
        }

        System.out.println();
        System.out.println("After changing negative to zero:");

        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] < 0) {
                arr8[i] = 0;
            }
            System.out.print(arr8[i] + " ");
        }

        System.out.println();
        System.out.println();

        /**
         * 9. Подсчитать одинаковые числа в одномерном массиве.
         */
        int[] arr9 = new int[10];
        int[][] identical = new int[10][3];

        System.out.println("All:");
        for (int i = 0; i < arr9.length; i++) {
            arr9[i] = random.nextInt(10);
            System.out.print(arr9[i] + " ");
        }

        for (int k = 0; k < arr9.length; k++) {
            identical[k][0] = -1;
        }

        int pointer = 0;
        int flag = 0;

        for (int i = 0; i < arr9.length; i++) {
            for (int j = i + 1; j < arr9.length; j++) {
                if (arr9[i] == arr9[j]) {
                    for (int k = 0; k < arr9.length; k++) {
                        if ((arr9[i] == identical[k][0]) && (identical[k][2] == 0)) {
                            identical[k][1]++;
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        int noBefore = 0;
                        for (int m = 0; m < arr9.length; m++) {
                            if (arr9[i] == identical[m][0]) {
                                noBefore++;
                            }
                        }
                        if (noBefore == 0) {
                            identical[pointer][0] = arr9[i];
                            identical[pointer][1] = 2;
                            pointer++;
                        }
                    }
                    flag = 0;
                }
            }
            for (int k = 0; k < arr9.length; k++) {
                if ((arr9[i] == identical[k][0]) && (identical[k][1] > 2)) {
                    identical[k][2] = 1;
                }
            }
        }

        System.out.println();
        System.out.println("Number of identical numbers: ");
        System.out.print("Number   : ");
        for (int i = 0; i < arr9.length; i++) {
            if (identical[i][0] != -1) {
                System.out.print(identical[i][0] + " ");
            }
        }
        System.out.println();
        System.out.print("Quantity : ");
        for (int i = 0; i < arr9.length; i++) {
            if (identical[i][0] != -1) {
                System.out.print(identical[i][1] + " ");
            }
        }

        System.out.println();
        System.out.println();

        /**
         * 10. Поменять минимальное и максимальное числа в массиве местами.
         */
        int[] arr10 = new int[20];

        System.out.println("All:");
        for (int i = 0; i < arr10.length; i++) {
            arr10[i] = random.nextInt(501);
            System.out.print(arr10[i] + " ");
        }

        int max10 = arr10[0];
        int min10 = arr10[0];
        int posMin = 0, posMax = 0;

        System.out.println();

        for (int i = 1; i < arr10.length; i++) {
            if (arr10[i] > max10) {
                max10 = arr10[i];
                posMax = i;
            }
            if (arr10[i] < min10) {
                min10 = arr10[i];
                posMin = i;
            }
        }

        arr10[posMax] += arr10[posMin];
        arr10[posMin] = arr10[posMax] - arr10[posMin];
        arr10[posMax] = arr10[posMax] - arr10[posMin];

        System.out.println("After changing max and min:");
        for (int i = 0; i < arr10.length; i++) {
            System.out.print(arr10[i] + " ");
        }

        System.out.println();
        System.out.println();

        /**
         * 11. Инвертировать массив.
         */
        int[] arr11 = new int[21];

        System.out.println("All:");
        for (int i = 0; i < arr11.length; i++) {
            arr11[i] = random.nextInt(501);
            System.out.print(arr11[i] + " ");
        }

        for (int i = 0; i < arr11.length / 2; i++) {
            arr11[i] += arr11[arr11.length - i - 1];
            arr11[arr11.length - i - 1] = arr11[i] - arr11[arr11.length - i - 1];
            arr11[i] = arr11[i] - arr11[arr11.length - i - 1];
        }

        System.out.println();
        System.out.println("Invert:");
        for (int i = 0; i < arr11.length; i++) {
            System.out.print(arr11[i] + " ");
        }

        System.out.println();
        System.out.println();

        /**
         * 12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
         */
        int[] arr12 = new int[20];

        System.out.println("All:");
        for (int i = 0; i < arr12.length; i++) {
            arr12[i] = random.nextInt(501);
            System.out.print(arr12[i] + " ");
        }

        int sum12_1 = arr12[0];
        int sum12_2 = arr12[arr12.length / 2];

        System.out.println();

        for (int i = 1; i < arr12.length / 2; i++) {
            sum12_1 += arr12[i];
        }

        for (int i = arr12.length / 2 + 1; i < arr12.length; i++) {
            sum12_2 += arr12[i];
        }

        int average12_1 = sum12_1 / (arr12.length / 2);
        int average12_2 = sum12_2 / (arr12.length / 2);

        System.out.println();
        System.out.println("Average 1 = " + average12_1);
        System.out.println("Average 2 = " + average12_2);
        System.out.println();

        if (average12_1 > average12_2) {
            System.out.println("First part is bigger than Second part");
            for (int i = 0; i < arr12.length / 2; i++) {
                System.out.print(arr12[i] + " ");
            }
        } else if (average12_1 < average12_2) {
            System.out.println("First part is bigger than Second part");
            for (int i = arr12.length / 2; i < arr12.length; i++) {
                System.out.print(arr12[i] + " ");
            }
        } else {
            System.out.println("Equal");
            for (int i = 0; i < arr12.length / 2; i++) {
                System.out.print(arr12[i] + " ");
            }
        }

        System.out.println();
        System.out.println();

        /**
         * 13. Найти сумму отрицательных чисел в одномерном массиве.
         */
        int[] arr13 = new int[10];

        System.out.println("All:");
        for (int i = 0; i < arr13.length; i++) {
            arr13[i] = -random.nextInt(50);
            if (random.nextInt(2) == 1) {
                arr13[i] *= -random.nextInt(10);
            }
            System.out.print(arr13[i] + " ");
        }

        int sum13 = 0;

        for (int i = 0; i < arr13.length; i++) {
            if (arr13[i] < 0) {
                sum13 += arr13[i];
            }
        }

        System.out.println();

        if (sum13 == 0) {
            System.out.println("No negative numbers in array");
        } else {
            System.out.println("Sum negative numbers = " + sum13);
        }

        System.out.println();
        System.out.println();

        /**
         * 14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
         */
        int[] arr14 = new int[10];

        System.out.println("All:");
        for (int i = 0; i < arr14.length; i++) {
            arr14[i] = random.nextInt(50);
        }

        arr14[random.nextInt(10)] = 0;

        for (int i = 0; i < arr14.length; i++) {
            System.out.print(arr14[i] + " ");
        }
        System.out.println();
        System.out.println("Before 0:");

        int i14 = 0;
        if (arr14[0] == 0) {
            System.out.println("0 is first element in array");
        }
        while (arr14[i14] != 0) {
            System.out.print(arr14[i14] + " ");
            i14++;
        }

        System.out.println();
        System.out.println();

        /**
         * 15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
         */
        int[] arr15 = new int[20];

        System.out.println("All:");
        for (int i = 0; i < arr15.length; i++) {
            arr15[i] = random.nextInt(501);
            System.out.print(arr15[i] + " ");
        }

        int max15_1 = arr15[0];
        int max15_2 = arr15[0];
        int pos15Max1 = 0, pos15Max2 = 0;

        System.out.println();

        for (int i = 1; i < arr15.length; i++) {
            if (arr15[i] > max15_1) {
                max15_1 = arr15[i];
                pos15Max1 = i;
            }
        }

        for (int i = 1; i < arr15.length; i++) {
            if ((arr15[i] > max15_2) && (i != pos15Max1)) {
                max15_2 = arr15[i];
                pos15Max2 = i;
            }
        }

        arr15[pos15Max1] += arr15[0];
        arr15[0] = arr15[pos15Max1] - arr15[0];
        arr15[pos15Max1] = arr15[pos15Max1] - arr15[0];

        arr15[pos15Max2] += arr15[arr15.length - 1];
        arr15[arr15.length - 1] = arr15[pos15Max2] - arr15[arr15.length - 1];
        arr15[pos15Max2] = arr15[pos15Max2] - arr15[arr15.length - 1];

        System.out.println("After changing max with first and last:");
        for (int i = 0; i < arr15.length; i++) {
            System.out.print(arr15[i] + " ");
        }

        System.out.println();
        System.out.println();

        /**
         * 16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
         */
        int[] arr16 = new int[20];

        System.out.println("All:");
        for (int i = 0; i < arr16.length; i++) {
            arr16[i] = random.nextInt(501);
            System.out.print(arr16[i] + " ");
        }

        int min16 = arr16[0];
        int posMin16 = 0;

        System.out.println();

        for (int i = 1; i < arr16.length; i++) {
            if (arr16[i] < min16) {
                min16 = arr16[i];
                posMin16 = i;
            }
        }

        System.out.println("Before min: ");
        if (posMin16 == 0) {
            System.out.println("Min is first element");
        }
        for (int i = 0; i < posMin16; i++) {
            System.out.print(arr16[i] + " ");
        }

        System.out.println();
        System.out.println();

        /**
         * 17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
         */
        int[] arr17 = new int[20];

        System.out.println("All:");
        for (int i = 0; i < arr17.length; i++) {
            arr17[i] = random.nextInt(51);
            System.out.print(arr17[i] + " ");
        }

        int max17 = arr17[0];
        int min17 = arr17[0];
        int posMin17 = 0, posMax17 = 0;

        System.out.println();

        for (int i = 1; i < arr17.length; i++) {
            if (arr17[i] > max17) {
                max17 = arr17[i];
                posMax17 = i;
            }
            if (arr17[i] < min17) {
                min17 = arr17[i];
                posMin17 = i;
            }
        }

        int count17 = posMin17 + 1;
        int sum17 = arr17[min(count17, arr17.length - 1)];
        System.out.println("Sum between min and max:");
        if (posMax17 > posMin17) {
            while (count17 != posMax17 - 1) {
                sum17 += arr17[count17 + 1];
                count17++;
            }
            System.out.println("Sum = " + sum17);
        } else if (posMax17 < posMin17) {
            System.out.println("Sorry. Max before Min");
        }

        System.out.println();
        System.out.println();

        /**
         * 18. Вывести в консоль половину массива в которой находиться наименьшее число массива.
         */
        int[] arr18 = new int[20];

        System.out.println("All:");
        for (int i = 0; i < arr18.length; i++) {
            arr18[i] = random.nextInt(501);
            System.out.print(arr18[i] + " ");
        }

        int min18 = arr18[0];
        int posMin18 = 0;

        System.out.println();

        for (int i = 1; i < arr18.length; i++) {
            if (arr18[i] < min18) {
                min18 = arr18[i];
                posMin18 = i;
            }
        }

        System.out.println("Min = " + min18);

        if (posMin18 < arr18.length / 2) {
            System.out.println("First part:");
            for (int i = 0; i < arr18.length / 2; i++) {
                System.out.print(arr18[i] + " ");
            }
        } else {
            System.out.println("Second part:");
            for (int i = arr18.length / 2; i < arr18.length; i++) {
                System.out.print(arr18[i] + " ");
            }
        }
        System.out.println();
        System.out.println();

        /**
         * 19. Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].
         */
        int[] arr19 = new int[20];

        System.out.println("All:");
        for (int i = 0; i < arr19.length; i++) {
            arr19[i] = random.nextInt(501);
            System.out.print(arr19[i] + " ");
        }

        int posA = random.nextInt(arr19.length);
        int posB = random.nextInt(arr19.length);

        while (arr19[posA] > arr19[posB]) {
            posB = random.nextInt(arr19.length);
        }

        int a = arr19[posA];
        int b = arr19[posB];

        int counter19 = 0;

        for (int i = 0; i < arr19.length; i++) {
            while ((arr19[arr19.length - counter19 - 1] >= a) && (arr19[arr19.length - counter19 - 1] <= b)) {
                counter19 = min(counter19 + 1, arr19.length - 1);
            }
            if ((arr19[i] >= a) && (arr19[i] <= b) && (arr19.length - counter19 - 1 > i)) {
                arr19[i] += arr19[arr19.length - counter19 - 1];
                arr19[arr19.length - counter19 - 1] = arr19[i] - arr19[arr19.length - counter19 - 1];
                arr19[i] = arr19[i] - arr19[arr19.length - counter19 - 1];
            }
        }

        System.out.println();

        System.out.println("After changing [" + a + "," + b + "]:");
        for (int i = 0; i < arr19.length; i++) {
            System.out.print(arr19[i] + " ");
        }
    }
}
