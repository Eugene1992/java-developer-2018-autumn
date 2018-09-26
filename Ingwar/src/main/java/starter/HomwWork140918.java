package starter;

import java.util.Arrays;

import java.util.Scanner;

public class HomwWork140918 {
    public static void main(String[] args) {
        //1. Вывести в консоль все парные числа одномерного массива.
        int[] intArray = {1, 8, -3, 0, 3, -6, 5, 4, 3, 2};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(intArray));

        System.out.println("Even numbers are:");
        for (int count = 0; count < intArray.length; count++) {
            if (intArray[count] % 2 == 0) {
                System.out.print(intArray[count] + " ");
            }
        }

        //2. Вывести все числа одномерного массива в обратном порядке.
        System.out.println("Backward array:");
        for (int count = intArray.length; count > 0; count--) {
            System.out.print(intArray[count - 1] + " ");
        }

        //3. Вывести первую и вторую половину одномерного массива.
        int halfArray = intArray.length / 2;
        System.out.println("First half:");
        for (int count = 0; count < halfArray; count++) {
            System.out.print(intArray[count] + " ");
        }
        System.out.println(" ");
        System.out.println("Second half:");
        for (int count = halfArray; count < intArray.length; count++) {
            System.out.print(intArray[count] + " ");
        }

        //4. Вывести первую и вторую половину одномерного массива в обратном порядке.
        halfArray = intArray.length / 2;
        System.out.println("First half:");
        for (int count = halfArray - 1; count >= 0; count--) {
            System.out.print(intArray[count] + " ");
        }
        System.out.println("");
        System.out.println("Second half:");
        for (int count = intArray.length - 1; count >= halfArray; count--) {
            System.out.print(intArray[count] + " ");
        }

        //5. Найти сумму всех элементов в массиве.
        int sumArray = 0;
        for (int count = 0; count < intArray.length; count++) {
            sumArray = sumArray + intArray[count];
        }
        System.out.println("Sum of array is " + sumArray);

        //6. Найти среднеарифметическое всех чисел массива.
        sumArray = 0;
        float arithmeticalMean = 0;
        for (int count = 0; count < intArray.length; count++) {
            sumArray = sumArray + intArray[count];
        }
        arithmeticalMean = sumArray / intArray.length;
        System.out.println("Arithmetical mean for array is " + arithmeticalMean);

        //7. Найти минимальное и максимальное число в массиве.
        int minNumber = intArray[0];
        int maxNumber = intArray[0];
        for (int count = 1; count < intArray.length; count++) {
            if (minNumber > intArray[count]) {
                minNumber = intArray[count];
            } else if (maxNumber < intArray[count]) {
                maxNumber = intArray[count];
            }
        }
        System.out.println("Minimum of array is " + minNumber);
        System.out.println("Maximum of array is " + maxNumber);

        //8. Заменить все отрицательные числа в массиве на 0.
        int intArrayNegative[] = {1, 2, 5, -4, 7, -2, 4, -5, -7};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(intArrayNegative));
        for (int count = 0; count < intArrayNegative.length; count++) {
            if (intArrayNegative[count] < 0) {
                intArrayNegative[count] = 0;
            }
        }
        System.out.println("Result array:");
        System.out.println(Arrays.toString(intArrayNegative));

        //9. Подсчитать одинаковые числа в одномерном массиве.
        System.out.println("Equal numbers in array:");
        int countEqual;
        int element;
        for (int count = 0; count < intArray.length; count++) {
            element = intArray[count];
            countEqual = 0;
            for (int countIn = 0; countIn < intArray.length; countIn++) {
                if (element == intArray[countIn]) {
                    countEqual++;
                }
            }
            System.out.println(element + " - " + countEqual);
        }

        //10. Поменять минимальное и максимальное числа в массиве местами.
        minNumber = intArray[0];
        int minIndex = 0;
        maxNumber = intArray[0];
        int maxIndex = 0;
        for (int count = 1; count < intArray.length; count++) {
            if (minNumber > intArray[count]) {
                minNumber = intArray[count];
                minIndex = count;
            } else if (maxNumber < intArray[count]) {
                maxNumber = intArray[count];
                maxIndex = count;
            }
        }
        System.out.println("Minimum of array is " + minNumber);
        System.out.println("Maximum of array is " + maxNumber);
        intArray[minIndex] = maxNumber;
        intArray[maxIndex] = minNumber;
        System.out.println("Result array:");
        System.out.println(Arrays.toString(intArray));

        //11. Инвертировать массив.
        int[] intArrayTarget = new int[10];
        for (int count = intArray.length - 1; count >= 0; count--) {
            intArrayTarget[intArray.length - 1 - count] = intArray[count];
        }
        System.out.println("Result array:");
        System.out.println(Arrays.toString(intArrayTarget));

        //12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
        halfArray = intArray.length / 2;
        int sumFirst = 0;
        int sumSecond = 0;
        for (int count = 0; count < halfArray; count++) {
            sumFirst = sumFirst + intArray[count];
        }
        for (int count = halfArray; count < intArray.length; count++) {
            sumSecond = sumSecond + intArray[count];
        }
        System.out.println("Greater half of array");
        if (sumFirst / halfArray > sumSecond / (intArray.length - halfArray)) {
            for (int count = 0; count < halfArray; count++) {
                System.out.print(intArray[count] + " ");
            }
        } else
            for (int count = halfArray; count < intArray.length; count++) {
                System.out.print(intArray[count] + " ");
            }

        //13. Найти сумму отрицательных чисел в одномерном массиве.
        int sumArrayNegative = 0;
        for (int count = 0; count < intArray.length; count++) {
            if (intArray[count] < 0) {
                sumArrayNegative = sumArrayNegative + intArray[count];
            }
        }
        System.out.println("Sum of array is " + sumArrayNegative);

        //14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
        for (int count = 0; count < intArray.length; count++) {
            if (intArray[count] == 0) {
                break;
            } else System.out.print(intArray[count] + " ");
        }

        //15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
        int firstGreat = intArray[0];
        int firstIndex = 0;
        int secondGreat = intArray[0];
        int secondIndex = 0;
        int tempGreat = 0;
        for (int count = 0; count < intArray.length; count++) {
            if (intArray[count] > firstGreat) {
                tempGreat = firstGreat;
                firstGreat = intArray[count];
                if (tempGreat > secondGreat) {
                    secondGreat = tempGreat;
                    secondIndex = firstIndex;
                }
                firstIndex = count;
            } else if (intArray[count] > secondGreat) {
                secondGreat = intArray[count];
                secondIndex = count;
            }
        }
        intArray[secondIndex] = intArray[0];
        intArray[0] = secondGreat;
        intArray[firstIndex] = intArray[intArray.length - 1];
        intArray[intArray.length - 1] = firstGreat;
        System.out.println("Result array:");
        System.out.println(Arrays.toString(intArray));

        //16. Написать программу, которая выводит на экран элементы одномерного массива,
        //которые расположены до минимального элемента всего массива.
        minNumber = intArray[0];
        minIndex = 0;
        for (int count = 0; count < intArray.length; count++) {
            if (intArray[count] < minNumber) {
                minNumber = intArray[count];
                minIndex = count;
            }
        }
        System.out.println("Array untill minimium:");
        for (int count = 0; count < minIndex; count++) {
            System.out.print(intArray[count] + " ");
        }

        //17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
        minNumber = intArray[0];
        minIndex = 0;
        maxNumber = intArray[0];
        maxIndex = 0;
        for (int count = 1; count < intArray.length; count++) {
            if (minNumber > intArray[count]) {
                minNumber = intArray[count];
                minIndex = count;
            } else if (maxNumber < intArray[count]) {
                maxNumber = intArray[count];
                maxIndex = count;
            }
        }
        if (maxIndex > minIndex) {
            System.out.println("Numbers between minimum and maximun:");
            for (int count = minIndex + 1; count < maxIndex; count++) {
                System.out.print(intArray[count] + " ");
            }
        } else for (int count = maxIndex + 1; count < minIndex; count++) {
            System.out.print(intArray[count] + " ");
        }

        //18. Вывести в консоль половину массива в которой находиться наименьшее число массива.
        minNumber = intArray[0];
        minIndex = 0;
        for (int count = 0; count < intArray.length; count++) {
            if (intArray[count] < minNumber) {
                minNumber = intArray[count];
                minIndex = count;
            }
        }
        System.out.println("The half of array with minimum:");
        halfArray = intArray.length / 2;
        if (minIndex < halfArray) {
            for (int count = 0; count < halfArray; count++) {
                System.out.print(intArray[count]);
            }
        } else for (int count = halfArray; count < intArray.length; count++) {
            System.out.print(intArray[count] + " ");
        }

        //19. Написать программу, которая перемещает в конец массива все элементы,
        // значения которых находится в отрезке [a,b].
        Scanner scan = new Scanner(System.in);
        int resultArray[] = new int[intArray.length];
        System.out.println("Input start of interval");
        int startInterval = scan.nextInt();
        System.out.println("Input end of interval");
        int endInterval = scan.nextInt();
        int resultCount = 0;
        for (int count = 0; count < intArray.length; count++) {
            if (!(intArray[count] >= startInterval && intArray[count] <= endInterval)) {
                resultArray[resultCount] = intArray[count];
                resultCount++;
            }
        }
        for (int count = 0; count < intArray.length; count++) {
            if (intArray[count] >= startInterval && intArray[count] <= endInterval) {
                resultArray[resultCount] = intArray[count];
                resultCount++;
            }
        }
        System.out.println("Result array is");
        System.out.println(Arrays.toString(resultArray));
    }
}
