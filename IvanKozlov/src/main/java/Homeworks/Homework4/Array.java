package Homeworks.Homework4;

import com.sun.deploy.util.ArrayUtil;

public class Array {

    public static void main(String[] args) {

        int[] arrayForOpertions0 = { 23, -5, 37, -13, 0, 44, 44,  100, -1, 44, 88, 12, 2, 44, 555, -111, 14, 37, 9, 21, 0, 2, -999, 2,};
        int[] arrayForOpertions1 = { 23, -5, 37, -13, 0, 44, 44,  100, -1, 44, 88, 12, 2, 44, 555, -111, 14, 37, 9, 21, 0, 2, -999, 2,};
        int arrayForOpertionsLength0 = arrayForOpertions0.length;
        int arrayForOpertionsLength1 = arrayForOpertions1.length;
        String arrayElementsSeparator = ", ";

// 1. Вывести в консоль все парные числа одномерного массива.

        System.out.println("Task 1");

        for (int arrayForOpertionsElement : arrayForOpertions0) {
            if (arrayForOpertionsElement % 2 == 0) {
                System.out.print(arrayForOpertionsElement + arrayElementsSeparator);
            }
        }
// 2. Вывести все числа одномерного массива в обратном порядке.

        System.out.println("");
        System.out.println("Task 2");

        for (int i = arrayForOpertionsLength0 - 1; i >= 0; i--) {
            System.out.print(arrayForOpertions0[i] + arrayElementsSeparator);
        }

// 3. Вывести первую и вторую половину одномерного массива.

        System.out.println("");
        System.out.println("Task 3");
        System.out.println("First part of the array");

        for (int i = 0; i <= (arrayForOpertionsLength0 / 2); i ++) {
            System.out.print(arrayForOpertions0[i] + arrayElementsSeparator);
        }

        System.out.println("");
        System.out.println("Second part of the array");

        for (int i = (arrayForOpertionsLength0 / 2); i < arrayForOpertionsLength0; i++) {
            System.out.print(arrayForOpertions0[i] + arrayElementsSeparator);
        }

// 4. Вывести первую и вторую половину одномерного массива в обратном порядке.

        System.out.println("");
        System.out.println("Task 4");
        System.out.println("First part of the array reversed");

        for (int i = (arrayForOpertionsLength0 / 2); i >= 0 ; i--) {
            System.out.print(arrayForOpertions0[i] + arrayElementsSeparator);
        }

        System.out.println("");
        System.out.println("Second part of the array reversed");

        for (int i = (arrayForOpertionsLength0 - 1); i >= (arrayForOpertionsLength0 / 2) ; i--) {
            System.out.print(arrayForOpertions0[i] + arrayElementsSeparator);
        }

// 5. Найти сумму всех элементов в массиве.

        System.out.println("");
        System.out.println("Task 5");

        int arrayElementsSum = 0;

        for (int arrayElement : arrayForOpertions0) {
            arrayElementsSum += arrayElement;
        }

        System.out.println("Array elements' sum is " + arrayElementsSum);

// 6. Найти среднеарифметическое всех чисел массива.

        System.out.println("Task 6");

        int arrayElementsAverage = arrayElementsSum / arrayForOpertionsLength0;

        System.out.println("Average is " + arrayElementsAverage);

// 7. Найти минимальное и максимальное число в массиве.

        System.out.println("Task 7");

        int maxArrayElement = arrayForOpertions0[0];
        int minArrayElement = arrayForOpertions0[0];

        for (int arrayElement : arrayForOpertions0) {
            if (arrayElement > maxArrayElement) {
                maxArrayElement = arrayElement;
            }

            if (arrayElement < minArrayElement) {
                minArrayElement = arrayElement;
            }
        }

        System.out.println("Max element is " + maxArrayElement);
        System.out.println("Min element is " + minArrayElement);

// 8. Заменить все отрицательные числа в массиве на 0.

        System.out.println("Task 8");

        for (int arrayElement : arrayForOpertions1) {
            if (arrayElement < 0) {
                arrayElement = 0;
            }
            System.out.print(arrayElement + arrayElementsSeparator);
        }

// TODO 9. Подсчитать одинаковые числа в одномерном массиве.

        System.out.println("");
        System.out.println("Task 9");

        int[] arrayWithUniqueElements = new int[arrayForOpertionsLength0];

        for (int i = 0; i < arrayForOpertionsLength0; i++) {

            int repeatCounter = 0;
            int arrayElement;

            arrayElement = arrayForOpertions0[i];
            for (int j = i + 1; j < arrayForOpertionsLength0; j++) {
                if (arrayElement == arrayForOpertions0[j]) {
                    repeatCounter += 1;
                }
            }
            System.out.println((arrayElement + " number repeats for " + repeatCounter + " times"));
        }

// 10. Поменять минимальное и максимальное числа в массиве местами.

        System.out.println("Task 10");

        int indexOfMinElement = 0;
        int indexOfMaxElement = 0;

        for (int i = 0; i < arrayForOpertionsLength0; i++) {
            if (arrayForOpertions0[i] == minArrayElement) {
                indexOfMinElement = i;
            }
        }

        for (int i = 0; i < arrayForOpertionsLength0; i++) {
            if (arrayForOpertions0[i] == maxArrayElement) {
                indexOfMaxElement = i;
            }
        }

        arrayForOpertions0[indexOfMinElement] = maxArrayElement;
        arrayForOpertions0[indexOfMaxElement] = minArrayElement;

        for (int arrayElement : arrayForOpertions0) {
            System.out.print((arrayElement + arrayElementsSeparator));
        }

// 11. Инвертировать массив.

        System.out.println("");
        System.out.println("Task 11");

        int[] invertedArray = new int[arrayForOpertionsLength0];

        for (int i = 0; i < arrayForOpertionsLength0; i++ ) {
            invertedArray[i] = arrayForOpertions0[arrayForOpertionsLength0 - 1 - i];
        }

        for (int invertedArrayElement : invertedArray) {
            System.out.print(invertedArrayElement + arrayElementsSeparator);
        }

// 12. Вывести в консоль половину массива, среднеарифметическое которых является большим.

        System.out.println("");
        System.out.println("Task 12");

        int firstPartElementsSum = 0;
        int secondPartElementsSum = 0;

        for (int i = 0; i < arrayForOpertionsLength0 / 2; i++) {
            firstPartElementsSum += arrayForOpertions0[i];
        }

        for (int i = arrayForOpertionsLength0 / 2; i < arrayForOpertionsLength0; i++) {
            secondPartElementsSum += arrayForOpertions0[i];
        }

        if (firstPartElementsSum != secondPartElementsSum) {
            if (firstPartElementsSum > secondPartElementsSum) {
                System.out.println("First part sum is bigger");
            } else {
                System.out.println("Second part sum is bigger");
            }
        } else {
            System.out.println("Both parts' sums are equal");
        }

// 13. Найти сумму отрицательных чисел в одномерном массиве.

        System.out.println("Task 13");

        int negativeArray0ElementsSum = 0;

        for (int arrayElements : arrayForOpertions0) {
            if (arrayElements < 0) {
                negativeArray0ElementsSum += arrayElements;
            }
        }

        System.out.println(negativeArray0ElementsSum);

// 14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.

        System.out.println("Task 14");

        int indexOfZeroElement = 0;

        for (int i = 0; i < arrayForOpertionsLength0; i++) {
            if (arrayForOpertions0[i] == 0) {
                indexOfZeroElement = i;
                break;
            }
        }

        for (int i = 0; i < indexOfZeroElement; i++) {
            System.out.print(arrayForOpertions0[i] + arrayElementsSeparator);
        }

// 15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.

        System.out.println("");
        System.out.println("Task 15");

        for (int arrayElement : arrayForOpertions0) {
            System.out.print((arrayElement + arrayElementsSeparator));
        }

        System.out.println("");

        int secondMaxArrayElement = 0;
        int indexOfSecondMaxArrayElement = 0;

        int firstArrayElement = arrayForOpertions0[0];
        int lastArrayElement = arrayForOpertions0[arrayForOpertionsLength0 - 1];

        for (int i = 0; i < arrayForOpertionsLength0; i++) {
            if (arrayForOpertions0[i] == maxArrayElement) {
                indexOfMaxElement = i;
            }
        }

        for (int i = 0; i < arrayForOpertionsLength0; i++) {
            if (arrayForOpertions0[i] > secondMaxArrayElement && arrayForOpertions0[i] < maxArrayElement) {
                secondMaxArrayElement = arrayForOpertions0[i];
                indexOfSecondMaxArrayElement = i;
            }
        }

        arrayForOpertions0[0] = secondMaxArrayElement;
        arrayForOpertions0[indexOfMaxElement] = lastArrayElement;
        arrayForOpertions0[arrayForOpertionsLength0 - 1] = maxArrayElement;
        arrayForOpertions0[indexOfSecondMaxArrayElement] = firstArrayElement;

        for (int arrayElement : arrayForOpertions0) {
            System.out.print((arrayElement + arrayElementsSeparator));
        }

// 16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.

//        will use min and max array elements from Task 7

        System.out.println("");
        System.out.println("Task 16");

        for (int i = 0; i < indexOfMinElement; i++) {
            System.out.print(arrayForOpertions0[i] + arrayElementsSeparator);
        }

// 17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.

        System.out.println("");
        System.out.println("Task 17");

        int startIndex = indexOfMinElement;
        int finishIndex = indexOfMinElement;
        int sumOfElementsInMaxMinRange = 0;

        if (indexOfMaxElement < indexOfMinElement) {
            startIndex = indexOfMaxElement;
            finishIndex = indexOfMinElement;
        }

        for (int i = startIndex + 1; i < finishIndex; i ++ ) {
            sumOfElementsInMaxMinRange += arrayForOpertions0[i];
        }

        System.out.println(sumOfElementsInMaxMinRange);

// 18. Вывести в консоль половину массива в которой находиться наименьшее число массива.

        System.out.println("Task 18");

        if (indexOfMinElement != arrayForOpertionsLength0 / 2) {
            if (indexOfMinElement <= arrayForOpertionsLength0 / 2) {
                for (int i = 0; i < arrayForOpertionsLength0 / 2; i++) {
                    System.out.print(arrayForOpertions0[i] + arrayElementsSeparator);
                }
            } else {
                for (int i = arrayForOpertionsLength0 / 2; i < arrayForOpertionsLength0; i++) {
                    System.out.print(arrayForOpertions0[i] + arrayElementsSeparator);
                }
            }
        } else {
            System.out.println("Min element is located in the middle af the array");
        }

// 19. Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].

        System.out.println("");
        System.out.println("Task 19");

        int firstPointInRange = 4;
        int secondPointInRange = 8;

        int[] editedArray = new int[arrayForOpertionsLength0];

        for (int arrayElement : arrayForOpertions0) {
            System.out.print((arrayElement + arrayElementsSeparator));
        }

        for (int i = 0; i < firstPointInRange; i++) {
            editedArray[i] = arrayForOpertions0[i];
        }

        for (int i = secondPointInRange + 1, j = firstPointInRange; i < arrayForOpertionsLength0; i++, j++) {
            editedArray[j] = arrayForOpertions0[i];
        }

        for (int i = secondPointInRange, j = arrayForOpertionsLength0 - 1; i >= firstPointInRange; i--, j--) {
            editedArray[j] = arrayForOpertions0[i];
        }

        System.out.println("");

        for (int arrayElement : editedArray) {
            System.out.print((arrayElement + arrayElementsSeparator));
        }

    }
}
