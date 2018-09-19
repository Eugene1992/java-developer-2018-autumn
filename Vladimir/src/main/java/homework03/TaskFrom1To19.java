package homework03;

import java.util.Arrays;
import java.lang.String;

public class TaskFrom1To19 {
    public static void main(String[] args) {
//        1. Вывести в консоль все парные числа одномерного массива.
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.print(arr1[i] + " ");
            }
        }
        System.out.println(" ");

//        2. Вывести все числа одномерного массива в обратном порядке.
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println(" ");

//        3. Вывести первую и вторую половину одномерного массива.
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("First half: ");
        for (int i = 0; i < arr3.length / 2; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.print("Second half: ");
        for (int i = arr3.length / 2; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println(" ");

//        4. Вывести первую и вторую половину одномерного массива в обратном порядке.
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("First half: ");
        for (int i = arr4.length / 2 - 1; i >= 0; i--) {
            System.out.print(arr4[i] + " ");
        }
        System.out.print("Second half: ");
        for (int i = arr4.length - 1; i >= arr4.length / 2; i--) {
            System.out.print(arr4[i] + " ");
        }
        System.out.println(" ");

//        5. Найти сумму всех элементов в массиве.
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum5 = 0;
        for (int i = 0; i < arr5.length; i++) {
            sum5 = sum5 + arr5[i];
        }
        System.out.println(sum5);

//        6. Найти среднеарифметическое всех чисел массива.
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumFor6 = 0;
        for (int i = 0; i < arr6.length; i++) {
            sumFor6 = sumFor6 + arr6[i];
        }
        float arithmeticMean = (float) sumFor6 / arr6.length;
        System.out.println(arithmeticMean);

//        7. Найти минимальное и максимальное число в массиве.
        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min7 = arr7[0];
        int max7 = arr7[0];
        for (int i = 1; i < arr7.length; i++) {
            if (min7 > arr7[i]) {
                min7 = arr7[i];
            }
            if (max7 < arr7[i]) {
                max7 = arr7[i];
            }
        }
        System.out.println("Min number: " + min7 + ". Max number: " + max7);

//        8. Заменить все отрицательные числа в массиве на 0.
        int[] arr8 = {1, 2, 3, -4, -5, 6, 7, -8, 9, 10};
        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] < 0) {
                arr8[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr8));

//        9. Подсчитать одинаковые числа в одномерном массиве.
        int[] arr9 = {2, 55, 3, 55, 2, 3, 3, -8, 33, 2, 0, 3, 0, 77, 77};
        int amountForZero = 0;
        int amountNotZero = 0;
        int amountNumber = 1;
        int allAmount;
        for (int i = 0; i < arr9.length; i++) {
            if (arr9[i] == 0) {
                amountForZero = amountForZero + 1;
            }
        }
        if (amountForZero == 1) {
            amountForZero = 0;
        }
        if (amountForZero > 1) {
            System.out.println("Zero repeats " + amountForZero + " times");
        }
        boolean same = false;
        for (int j = 0; j < arr9.length; j++) {
            amountNumber = 1;
            if (amountNotZero > 0 && same == true) {
                amountNotZero = amountNotZero + 1;
                same = false;
            }
            for (int k = (j + 1); k < arr9.length; k++) {
                if (arr9[j] != 0) {
                    if (arr9[j] == arr9[k]) {
                        amountNumber++;
                        amountNotZero = amountNotZero + 1;
                        arr9[k] = 0;
                        same = true;
                    }
                }
            }
            if (arr9[j] != 0) {
                System.out.println(arr9[j] + " repeats " + amountNumber + " times");
            }
        }
        allAmount = amountForZero + amountNotZero;
        System.out.println("Amount of all same elements: " + allAmount);

//        10. Поменять минимальное и максимальное числа в массиве местами.
        int[] arr10 = {1, 2, 3, -4, -5, 6, 7, -8, 9, 10};
        int min10 = arr10[0];
        int max10 = arr10[0];
        int numFotChange10;
        for (int i = 1; i < arr10.length; i++) {
            if (min10 > arr10[i]) {
                min10 = i;
            }
            if (max10 < arr10[i]) {
                max10 = i;
            }
        }
        numFotChange10 = arr10[max10];
        arr10[max10] = arr10[min10];
        arr10[min10] = numFotChange10;
        System.out.println(Arrays.toString(arr10));

//        11. Инвертировать массив.
        int[] arr11 = {1, 2, 3, -4, -5, 6, 7, -8, 9};
        int numFotChange11;
        for (int i = 0; i < arr11.length / 2; i++) {
            numFotChange11 = arr11[arr11.length - 1 - i];
            arr11[arr11.length - 1 - i] = arr11[i];
            arr11[i] = numFotChange11;
        }
        System.out.println(Arrays.toString(arr11));

//        12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
        int[] arr12 = {1, 2, 3, -4, -5, 6, 7, -8, 9, 10};
        float arHalfFirst;
        float arHalfSecond;
        int sumFirst = 0;
        int sumSecond = 0;
        for (int i = 0; i < arr12.length / 2; i++) {
            sumFirst += arr12[i];
        }
        arHalfFirst = sumFirst / (arr12.length / 2);
        for (int i = arr12.length / 2; i < arr12.length; i++) {
            sumSecond += arr12[i];
        }
        arHalfSecond = sumSecond / (arr12.length / 2);
        if (arHalfFirst > arHalfSecond) {
            System.out.print("First half is bigger: ");
            for (int i = 0; i < arr12.length / 2; i++) {
                System.out.print(arr12[i] + " ");
            }
        } else {
            System.out.print("Second half is bigger: ");
            for (int i = arr12.length / 2; i < arr12.length; i++) {
                System.out.print(arr12[i] + " ");
            }
        }
        System.out.println(" ");

//        13. Найти сумму отрицательных чисел в одномерном массиве.
        int[] arr13 = {1, 2, 3, -4, -5, 6, 7, -8, 9, 10};
        int sumNegative = 0;
        for (int i = 0; i < arr13.length; i++) {
            if (arr13[i] < 0) {
                sumNegative = sumNegative + arr13[i];
            }
        }
        System.out.println(sumNegative);

//        14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
        int[] arr14 = {1, 2, 3, -4, -5, 0, 9, -8, 7, 5};
        int barier = 0;
        do {
            System.out.print(" " + arr14[barier]);
            barier++;
        } while (arr14[barier - 1] != 0);
        System.out.println(" ");

//        15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
        int[] arr15 = {1, 2, 3, -4, -5, 0, 9, -8, 7, 5};
        System.out.println(Arrays.toString(arr15));
        int firstMax = arr15[0];
        int secondMax = arr15[0];
        int positionFirstMax = 0;
        int positionSecondMax = 0;
        int firstChangeVar = arr15[0];
        int secondChangeVar = arr15[arr15.length - 1];
        for (int i = 1; i < arr15.length; i++) {
            if (firstMax < arr15[i]) {
                firstMax = arr15[i];
                positionFirstMax = i;
                if (secondMax < arr15[i - 1]) {
                    secondMax = arr15[i - 1];
                    positionSecondMax = i - 1;
                }
            } else {
                if (secondMax < arr15[i]) {
                    secondMax = arr15[i];
                    positionSecondMax = i;
                }
            }
        }
        arr15[0] = arr15[positionFirstMax];
        arr15[positionFirstMax] = firstChangeVar;
        arr15[arr15.length - 1] = arr15[positionSecondMax];
        arr15[positionSecondMax] = secondChangeVar;
//        System.out.println(firstMax + " " + secondMax + " " + positionFirstMax + " " + positionSecondMax);
        System.out.println(Arrays.toString(arr15));
        System.out.println(" ");

//        16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
        int[] arr16 = {1, 2, 3, -4, -5, 0, 9, -8, 7, 5};
        int min16 = arr16[0];
        int positionMin = 0;
        for (int i = 1; i < arr16.length; i++) {
            if (min16 > arr16[i]) {
                min16 = arr16[i];
                positionMin = i;
            }
        }
        System.out.println("Min position in this array: " + positionMin);
        for (int j = 0; j < positionMin; j++) {
            System.out.print(arr16[j] + " ");
        }
        System.out.println("");

//        17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
        int[] arr17 = {1, 15, 3, 15, -5, 0, 9, -8, 7, 5};
        int min17 = arr17[0];
        int max17 = arr17[0];
        int minPosition17 = 0;
        int maxPosition17 = 0;
        int sum17 = 0;
        for (int i = 1; i < arr17.length; i++) {
            if (max17 < arr17[i]) {
                max17 = arr17[i];
                maxPosition17 = i;
            }
            if (min17 > arr17[i]) {
                min17 = arr17[i];
                minPosition17 = i;
            }
        }
        System.out.println(max17 + " " + min17 + " " + maxPosition17 + " " + minPosition17);
        if (minPosition17 < maxPosition17) {
            if (maxPosition17 == (minPosition17 + 1)) {
                System.out.println("There is no element between min and max element");
            } else {
                for (int j = (minPosition17 + 1); j < maxPosition17; j++) {
                    sum17 = sum17 + arr17[j];
                }
                System.out.println(sum17);
            }
        } else {
            if (minPosition17 == (maxPosition17 + 1)) {
                System.out.println("There is no element between min and max element");
            } else {
                for (int j = (maxPosition17 + 1); j < minPosition17; j++) {
                    sum17 = sum17 + arr17[j];
                }
                System.out.println(sum17);
            }
        }

//        18. Вывести в консоль половину массива в которой находиться наименьшее число массива.
        int[] arr18 = {1, 15, 3, 15, -5, 0, 9, -8, 7, 5};
        int min18 = arr18[0];
        int minPointer = 0;
        for (int i = 1; i < arr18.length; i++) {
            if (min18 > arr18[i]) {
                minPointer = i;
            }
        }
        if (minPointer < (arr18.length / 2)) {
            for (int j = 0; j < (arr18.length / 2); j++) {
                System.out.print(arr18[j] + " ");
            }
        } else {
            for (int k = (arr18.length / 2); k < arr18.length; k++) {
                System.out.print(arr18[k] + " ");
            }
        }
        System.out.println(" ");

//        19. Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].
        int[] arr19 = {1, 15, 3, 15, -5, 0, 9, -8, 7, 5};
//      a і b - значення порядкових номерів елементів
        int a = 3;
        int b = 7;
        String before = "";
        String after = "";
        String interval = "";
        String newArr19;
        for (int i = 0; i < a; i++) {
            before = before + arr19[i] + " ";
        }
        System.out.print(before);
        for (int j = (b + 1); j < arr19.length; j++) {
            after = after + arr19[j] + " ";
        }
        System.out.print(after);
        for (int k = a; k <= b; k++) {
            interval = interval + arr19[k] + " ";
        }
        newArr19 = before + after + interval;
        System.out.println(newArr19.toCharArray());
    }
}