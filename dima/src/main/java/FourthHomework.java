import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FourthHomework {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Масив");
        System.out.println(Arrays.toString(array1));
        System.out.println(" Парные значения");
        for (int a1 = 0; a1 < array1.length; a1++) {
            if (array1[a1] % 2 == 0) {
                System.out.print(array1[a1] + " ");
            }
        }
        //2///
        int[] array2 = {5, 8, 9, 2, -6, 0};
        System.out.println("");
        System.out.println("Масив");
        System.out.println(Arrays.toString(array1));
        System.out.println("В обратном порядке");
        for (int a2 = array2.length; a2 > 0; a2--) {
            System.out.print(array2[a2 - 1] + " ");
        }
        //3//
        int[] array3 = {5, 9, 2, 8, 1, 0, 4, 3};
        int arrayHalf = array3.length / 2;
        System.out.println("");
        System.out.println("Масив");
        System.out.println("Первая часть масива");
        for (int a3 = 0; a3 < arrayHalf; a3++) {
            System.out.print(array3[a3] + " ");
        }
        //4//
        System.out.println("");
        System.out.println("Вторая часть масива");
        for (int a3 = arrayHalf; a3 < array3.length; a3++) {
            System.out.print(array3[a3] + " ");
        }
        int[] array4 = {5, 8, 2, 7, 3, 9};
        int half1 = array4.length / 2;
        System.out.println("");
        System.out.println("Масив");
        System.out.println("Первая часть");
        for (int a4 = half1 - 1; a4 >= 0; a4--) {
            System.out.println(array4[a4] + " ");
        }
        System.out.println("Вторая часть");
        for (int a4 = array4.length - 1; a4 >= half1; a4--) {
            System.out.println(array4[a4] + " ");
        }
        //5//
        int array5[] = {3, 7, 1, 83, 49, 14, 50,};
        int sum = 0;
        System.out.println("");
        System.out.println("Масив");
        System.out.println("Сума елементов");
        for (int a5 = 0; a5 < array5.length; a5++) {
            sum = sum + array5[a5];
        }
        System.out.println("" + sum);


//6//
        System.out.println("");
        System.out.println("Масив");
        int array6[] = {3, 7, 1, 83, 49, 14, 50,};
        sum = 0;
        float sumHalf = 0;
        for (int count = 0; count < array6.length; count++) {
            sum = sum + array6[count];
        }
        sumHalf = sum / array6.length;
        System.out.println(" Арифметическая разница " + sumHalf);

        //7//
        int array7[] = {3, 7, 1, 83, 49, 14, 50,};
        int maxNumber = array7[0];
        int minNumber = array7[0];
        for (int count = 1; count < array7.length; count++) {
            if (minNumber > array7[count]) {
                minNumber = array7[count];
            } else if (maxNumber < array7[count]) {
                maxNumber = array7[count];
            }
        }
        System.out.println(" Минимальное число в масиве " + minNumber);
        System.out.println(" Максимальное число в масиве " + maxNumber);

        //8//
        int array8[] = {-3, -7, -1, 83, -49, 14, -50,};
        System.out.println("");
        System.out.println("Масив");
        System.out.println(Arrays.toString(array8));
        for (int count = 0; count < array8.length; count++) {
            if (array8[count] < 0) {
                array8[count] = 0;
            }
        }
        System.out.println(" Замена на 0: ");
        System.out.println(Arrays.toString(array8));

        //9//
        int array9[] = {3, 3, 17, 90, 6, 86, 17, 90};
        System.out.println("");
        System.out.println("Масив");
        System.out.println(Arrays.toString(array9));
        int bothNumbers;
        int a;
        for (int count1 = 0; count1 < array9.length; count1++) {
            a = array9[count1];
            bothNumbers = 0;
            for (int count2 = 0; count2 < array9.length; count2++) {
                if (a == array9[count2]) {
                    bothNumbers++;
                }
            }
            System.out.println(" Одинаковые елементы масива " + bothNumbers);
        }

        //10//
        int array10[] = {1, 7, 4, 2, 9, 50, 36};
        System.out.println("");
        System.out.println("Масив");
        System.out.println(Arrays.toString(array10));
        minNumber = array10[0];
        int minIndex = 0;
        int maxIndex = 0;
        maxNumber = array10[0];
        for (int count = 1; count < array10.length; count++) {
            if (minNumber > array10[count]) {
                minNumber = array10[count];
                minIndex = count;
            } else if (maxNumber < array10[count]) {
                maxNumber = array10[count];
                maxIndex = count;
            }
        }
        System.out.println(" Минимальный елемент " + minNumber);
        System.out.println(" Максимальный елемент " + maxNumber);
        array10[minIndex] = maxNumber;
        array10[maxIndex] = minNumber;
        System.out.println(" Результаты");
        System.out.println(Arrays.toString(array10));

        //11//
        int array11[] = {4, 6, 23, 7, 9, 2, 9, 49};
        int[] intArrayTarget = new int[10];
        for (int count = array11.length - 1; count >= 0; count--) {
            intArrayTarget[array11.length - 1 - count] = array11[count];
        }
        System.out.println("Результат");
        System.out.println(Arrays.toString(intArrayTarget));

        //12//
        int array12[] = {3, 7, 4, 8, 4, 0,};
        int halfArray;
        halfArray = array12.length / 2;
        int sum1 = 0;
        int sum2 = 0;
        for (int count = 0; count < halfArray; count++) {
            sum1 = sum1 + array12[count];
        }
        for (int count = halfArray; count < array12.length; count++) {
            sum2 = sum2 + array12[count];
        }
        System.out.println("");
        if (sum1 / halfArray > sum2 / (array12.length - halfArray)) {
            for (int count = 0; count < halfArray; count++) {
                System.out.print(array12[count] + " ");
            }
        } else
            for (int count = halfArray; count < array12.length; count++) {
                System.out.print(array12[count] + " ");
            }

        //13//
        int array13[] = {5, 3, 2, 7, 8, 1, 9, 40};
        int sumArrayNegative = 0;
        for (int count = 0; count < array13.length; count++) {
            if (array13[count] < 0) {
                sumArrayNegative = sumArrayNegative + array13[count];
            }
        }
        System.out.println("Сума масива " + sumArrayNegative);

        //14//
        int array14[] = {5, 3, 2, 7, 8, 1, 9, 40};
        for (int count = 0; count < array14.length; count++) {
            if (array14[count] == 0) {
                break;
            } else System.out.print(array14[count] + " ");
        }

        //15//
        int array15[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int firstGreat = 0;
        int firstIndex = 0;
        int secondGreat = array15[0];
        int secondIndex = 0;
        int tempGreat = 0;
        for (int count = 0; count < array15.length; count++) {
            if (array15[count] > firstGreat) {
                tempGreat = firstGreat;
                firstGreat = array15[count];
                if (tempGreat > secondGreat) {
                    secondGreat = tempGreat;
                    secondIndex = firstIndex;
                }
                firstIndex = count;
            } else if (array15[count] > secondGreat) {
                secondGreat = array15[count];
                secondIndex = count;
            }
        }
        array15[secondIndex] = array15[0];
        array15[0] = secondGreat;
        array15[firstIndex] = array15[array15.length - 1];
        array15[array15.length - 1] = firstGreat;
        System.out.println(" Результат ");
        System.out.println(Arrays.toString(array15));
        //16//
        int array16[] = {3, 7, 4, 8, 4, 0,};
        minNumber = array16[0];
        minIndex = 0;
        for (int count = 0; count < array16.length; count++) {
            if (array16[count] < minNumber) {
                minNumber = array16[count];
                minIndex = count;
            }
        }
        System.out.println(" Масив до минимума ");
        for (int count = 0; count < minIndex; count++) {
            System.out.print(array16[count] + " ");
        }

        //17//
        int array17[] = {3, 7, 4, 8, 4, 0,};
        minNumber = array17[0];
        minIndex = 0;
        maxNumber = array17[0];
        maxIndex = 0;
        for (int count = 1; count < array17.length; count++) {
            if (minNumber > array17[count]) {
                minNumber = array17[count];
                minIndex = count;
            } else if (maxNumber < array17[count]) {
                maxNumber = array17[count];
                maxIndex = count;
            }
        }
        if (maxIndex > minIndex) {
            System.out.println(" Елементы между минимом и максимумом ");
            for (int count = minIndex + 1; count < maxIndex; count++) {
                System.out.print(array17[count] + " ");
            }
        } else for (int count = maxIndex + 1; count < minIndex; count++) {
            System.out.print(array17[count] + " ");
        }

        //18//
        int array18[] = {3, 7, 4, 8, 4, 0,};
        minNumber = array18[0];
        minIndex = 0;
        for (int count = 0; count < array18.length; count++) {
            if (array18[count] < minNumber) {
                minNumber = array18[count];
                minIndex = count;
            }
        }
        System.out.println(" Половина масива с минимумом ");
        halfArray = array18.length / 2;
        if (minIndex < halfArray) {
            for (int count = 0; count < halfArray; count++) {
                System.out.print(array18[count]);
            }
        } else for (int count = halfArray; count < array18.length; count++) {
            System.out.print(array18[count] + " ");
        }

        //19//
        int array19[] = {6, 5, 8, 3, 9, 4};
        int resultArray[] = new int[array19.length];
        System.out.println("Начало интервала");
        int startInterval = 2;
        System.out.println("Конец интервала");
        int endInterval = 8;
        int resultCount = 0;
        for (int count = 0; count < array19.length; count++) {
            if (!(array19[count] >= startInterval && array19[count] <= endInterval)) {
                resultArray[resultCount] = array19[count];
                resultCount++;
            }
        }
        for (int count = 0; count < array19.length; count++) {
            if (array19[count] >= startInterval && array19[count] <= endInterval) {
                resultArray[resultCount] = array19[count];
                resultCount++;
            }
        }
        System.out.println("Результат");
        System.out.println(Arrays.toString(resultArray));
    }
}



