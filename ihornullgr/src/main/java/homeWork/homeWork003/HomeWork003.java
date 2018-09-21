package homeWork.homeWork003;

import java.util.Arrays;

public class HomeWork003 {
    public static void main(String[] args) {
        //1. Вывести в консоль все парные числа одномерного массива.
        int[] arr1 = new int[6];
        arr1[0] = 5;
        arr1[1] = 10;
        arr1[2] = 12;
        arr1[3] = 11;
        arr1[4] = 66;
        arr1[5] = 33;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println("Четные " + arr1[i]);
            } else System.out.println("Нечетные" + arr1[i]);

        }

        //2. Вывести все числа одномерного массива в обратном порядке.
        int[] arr2 = new int[6];
        arr2[0] = 31;
        arr2[1] = 32;
        arr2[2] = 33;
        arr2[3] = 34;
        arr2[4] = 35;
        arr2[5] = 36;
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.println(arr2[i]);
        }

        //3. Вывести первую и вторую половину одномерного массива.
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i0 = 0; i0 < arr3.length / 2; i0++) {
            System.out.println("Первая половина " + arr3[i0]);
        }

        for (int i = arr3.length / 2; i <= arr3.length - 1; i++) {
            System.out.println("Вторая половина " + arr3[i]);
        }

        //4. Вывести первую и вторую половину одномерного массива в обратном порядке.
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i0 = arr4.length - 5; i0 >= 0; i0--) {
            System.out.println("Первая половина в обратном " + arr4[i0]);
        }

        for (int i = arr4.length - 1; i >= arr4.length / 2; i--) {
            System.out.println("Вторая половина в обратном " + arr4[i]);
        }

        //5. Найти сумму всех элементов в массиве.
        int[] arr5 = {3, 5, 12, 20};
        int sum = 0;
        for (int i = 0; i < arr5.length; i++) {
            sum = sum + arr5[i];
        }
        System.out.println("Сумма всех элементов " + sum);

        //6. Найти среднеарифметическое всех чисел массива.
        int[] arr6 = {22, 23};
        int sum0 = 0;
        for (int i = 0; i < arr6.length; i++) {
            sum0 += arr6[i];
        }
        System.out.println("Среднее арифметическое " + sum0 / arr6.length);

        //7. Найти минимальное и максимальное число в массиве.
        int[] arr7 = {5, 3, 55, 22, 77, 1};
        int max = arr7[0];
        int min = arr7[0];
        for (int i = 0; i < arr7.length; i++) {
            if (arr7[i] > max) {
                max = arr7[i];
            }
            if (arr7[i] < min) {
                min = arr7[i];
            }
        }
        System.out.println("Min - " + min + " " + "Max - " + max);

        //8. Заменить все отрицательные числа в массиве на 0.
        int[] arr8 = {55, -4, 56, -7, -2, 77, 10};
        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] < 0) {
                arr8[i] = 0;
            }
            System.out.println(arr8[i]);
        }

        //9. Посчитать одинаковые числа в одномерном массиве.
        int[] arr9 = {3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 4, 4, 22, 22};
        int[] counter = new int[23];
        for (int i = 0; i < arr9.length; i++) {
            counter[arr9[i]]++;
        }

        System.out.println("value\tcount");
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "\t" + counter[i]);
        }
        //10. Поменять минимальное и максимальное числа в массиве местами.
        int[] arr10 = {5, 3, 55, 22, 77, 1};
        int max0 = arr10[0];
        int min0 = arr10[0];
        for (int i = 0; i < arr10.length; i++) {
            if (arr10[i] > max0) {
                min0 = arr10[i];
            }
            if (arr10[i] < min0) {
                max0 = arr10[i];
            }
        }
        System.out.println("Max (min) - " + min + " " + "Min (max) - " + max);
        //11. Инвертировать массив.
        int[] arr11 = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = arr11.length - 1; i >= 0; i--) {
            System.out.println(arr11[i]);
        }

        //12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
        // TODO: 17.09.2018 несовсем понятно
        int[] arr12 = {55, 57, 57, 55};
        int firstPart = 0;
        int secondPart = 0;
        for (int i = 0; i < arr12.length / 2; i++) {
            firstPart += arr12[i];
        }
        for (int i = arr12.length / 2; i < arr12.length; i++) {
            secondPart += arr12[i];

            if (firstPart != secondPart) {
                if (firstPart > secondPart) {
                    System.out.println("Первая часть больше " + firstPart);
                } else {
                    System.out.println("Вторая часть больше " + secondPart);
                }
            } else {
                System.out.println("Сумма обеих частей равна");
            }
        }
        //13. Найти сумму отрицательных чисел в одномерном массиве.
        int[] arr13 = {-55, 44, -53, 22, -2, -1, -12};
        for (int i = 0; i < arr13.length; i++) {
            if (arr13[i] < 0) {
                System.out.println("Отрицательные числа " + arr13[i]);
            }
        }
        //14. Дан массив чисел, среди которых имеется один ноль.
        // Вывести на печать все числа до нуля включительно.
        int[] arr14 = {-1, 33, -14, 0, 30};
        for (int i = 0; i < arr14.length; i++) {
            if (arr14[i] <= 0) {
                System.out.println("Все числа до ноля включительно " + arr14[i]);
            } else {
                System.out.println("После ноля" + arr14[i]);
            }
        }
        //15. Написать программу, меняющую местами два наибольших элемента одномерного массива
        // с первым и последним.System.out.println("Seccccc " + secondEl);
        int[] arr15 = {55, 33, 14, 77, 88, 4};
        int firstGreat = arr15[0];
        int firstIndex = 0;
        int secondGreat = arr15[0];
        int secondIndex = 0;
        int tempGreat = 0;
        for (int i = 0; i < arr15.length; i++) {
            if (arr15[i] > firstGreat) {
                tempGreat = firstGreat;
                firstGreat = arr15[i];
                if (tempGreat > secondGreat) {
                    secondGreat = tempGreat;
                    secondIndex = firstIndex;
                }
                firstIndex = i;
            } else if (arr15[i] > secondGreat) {
                secondGreat = arr15[i];
                secondIndex = i;
            }
        }
        arr15[secondIndex] = arr15[0];
        arr15[0] = secondGreat;
        arr15[firstIndex] = arr15[arr15.length - 1];
        arr15[arr15.length - 1] = firstGreat;
        System.out.println("Результат строки:");
        System.out.println(Arrays.toString(arr15));

        //16. Написать программу, которая выводит на экран элементы одномерного массива,
        // которые расположены до минимального элемента всего массива.
        min = arr15[0];
        int minIndex = 0;
        for (int i = 0; i < arr15.length; i++) {
            if (arr15[i] < min) {
                min = arr15[i];
                minIndex = i;
            }
        }
        System.out.println("Массив до минимума");
        for (int i = 0; i < minIndex; i++) {
            System.out.print(arr15[i] + " ");
        }

        //17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
        int[] array = {5, 66, 88, 44, 345, 2};
        int minSum = array[0];
        int maxSum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minSum) {
                minSum = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxSum) {
                maxSum = array[i];
            }
        }
        System.out.println("MinEl " + minSum + " " + "MaxEl " + maxSum);

        int calBetweenMinMax = 0;
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            calBetweenMinMax = calBetweenMinMax + array[i];
            totalSum = (calBetweenMinMax - minSum) - maxSum;

        }
        System.out.println(" ");
        System.out.println("Between " + totalSum);

        //18. Вывести в консоль половину массива в которой находиться наименьшее число массива.
        System.out.println("");
        int[] arr17 = {30, 55, 40, 100, 15};
        int minNum = arr17[0];
        int index = 0;
        for (int i = 0; i < arr17.length; i++) {
            if (arr17[i] < minNum) {
                minNum = arr17[i];
                index = i;
            }
        }
        if (index != arr17.length / 2) {
            if (index <= arr17.length / 2) {
                for (int i = 0; i < arr17.length / 2; i++) {
                    System.out.println("");
                }
            } else {
                for (int i = arr17.length / 2; i < arr17.length; i++) {
                    System.out.print("Половина массива");
                    System.out.println(" " + arr17[i]);
                }

            }
        } else {
            System.out.println("Минимальный элемент расположен в средине массива");
        }

        //19. Написать программу, которая перемещает в конец массива все элементы,
        // значения которых находится в отрезке [a,b].
        int[] array19 = {5, 66, 88, 44, 345, 22};
        int a = 6;
        int b = 2;
        int sumEndEl = 0;
        int totalsm = 0;
        for (int i = array19.length - 1; i >= array19.length - 1; i--) {
            sumEndEl = array19[i];
            totalsm = (sumEndEl + a) + b;
            System.out.println("");
            System.out.println("Перемещение в конец массива " + totalsm);
        }
    }
}
