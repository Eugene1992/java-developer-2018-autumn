import java.util.Arrays;

public class HomwWork140918 {
    public static void main(String[] args) {
        //1. Вывести в консоль все парные числа одномерного массива.
        /*int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(intArray));*/

        /*System.out.println("Even numbers are:");
        for (int count = 0; count < intArray.length; count++){
            if (intArray[count] % 2 == 0){
                System.out.print(intArray[count]+" ");
            }
        }*/

        //2. Вывести все числа одномерного массива в обратном порядке.
        /*System.out.println("Backward array:");
        for (int count = intArray.length; count > 0;count--){
            System.out.print(intArray[count-1]+" ");
        }*/

        //3. Вывести первую и вторую половину одномерного массива.
        /*int halfArray = intArray.length/2;
        System.out.println("First half:");
        for (int count = 0; count < halfArray; count++){
            System.out.print(intArray[count]+" ");
        }
        System.out.println("");
        System.out.println("Second half:");
        for (int count = halfArray; count < intArray.length; count++){
            System.out.print(intArray[count]+ " ");
        }*/

        //4. Вывести первую и вторую половину одномерного массива в обратном порядке.
        /*int halfArray = intArray.length/2;
        System.out.println("First half:");
        for (int count = halfArray-1; count >=0; count--){
            System.out.print(intArray[count]+" ");
        }
        System.out.println("");
        System.out.println("Second half:");
        for (int count = intArray.length-1; count >= halfArray ; count--){
            System.out.print(intArray[count]+ " ");
        }*/

        //5. Найти сумму всех элементов в массиве.
        /*int sumArray = 0;
        for (int count = 0; count < intArray.length; count++){
            sumArray = sumArray + intArray[count];
        }
        System.out.println("Sum of array is "+sumArray);*/

        //6. Найти среднеарифметическое всех чисел массива.
        /*int sumArray = 0;
        float arithmeticalMean = 0;
        for (int count = 0; count < intArray.length; count++){
            sumArray = sumArray + intArray[count];
        }
        arithmeticalMean = sumArray/intArray.length;
        System.out.println("Arithmetical mean for array is "+ arithmeticalMean); */

        //7. Найти минимальное и максимальное число в массиве.
        /*int minNumber = intArray[0];
        int maxNumber = intArray[0];
        for (int count = 1; count < intArray.length; count++){
            if (minNumber > intArray[count]) {
                minNumber = intArray[count];
            }else if (maxNumber < intArray[count]) {
                maxNumber = intArray[count];
            }
        }
        System.out.println("Minimum of array is "+minNumber);
        System.out.println("Maximum of array is "+maxNumber);*/

        //8. Заменить все отрицательные числа в массиве на 0.
        /*int intArrayNegative[] = {1,2,5,-4,7,-2,4,-5,-7};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(intArrayNegative));

        for (int count = 0; count < intArrayNegative.length; count++){
            if (intArrayNegative[count] < 0) {
                intArrayNegative[count] = 0;
            }
        }
        System.out.println("Result array:");
        System.out.println(Arrays.toString(intArrayNegative));*/

        //9. Подсчитать одинаковые числа в одномерном массиве.
        /*int[] intArray = {1,2,3,4,3,6,5,8,3,2};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(intArray));
        System.out.println("Equal numbers in array:");
        int countEqual;
        int element;
        for (int count = 0; count < intArray.length; count++){
            element = intArray[count];
            countEqual = 0;
                for (int countIn = 0; countIn < intArray.length; countIn++) {
                    if (element == intArray[countIn]){
                        countEqual++;
                    }
                }
            System.out.println(element+" - "+countEqual);
        }*/

        //10. Поменять минимальное и максимальное числа в массиве местами.
        /*int[] intArray = {1,2,3,4,3,6,5,8,3,2};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(intArray));
        int minNumber = intArray[0];
        int minIndex = 0;
        int maxNumber = intArray[0];
        int maxIndex = 0;
        for (int count = 1; count < intArray.length; count++){
            if (minNumber > intArray[count]) {
                minNumber = intArray[count];
                minIndex = count;
            }else if (maxNumber < intArray[count]) {
                maxNumber = intArray[count];
                maxIndex = count;
            }
        }
        System.out.println("Minimum of array is "+minNumber);
        System.out.println("Maximum of array is "+maxNumber);
        intArray[minIndex] = maxNumber;
        intArray[maxIndex] = minNumber;
        System.out.println("Result array:");
        System.out.println(Arrays.toString(intArray));*/

        //11. Инвертировать массив.
        /*int[] intArray = {1,2,3,4,3,6,5,8,3,2};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(intArray));
        int[] intArrayTarget = new int[10];
        for (int count = intArray.length-1; count >=0 ; count--) {
            intArrayTarget[intArray.length-1-count] = intArray[count];
        }
        System.out.println("Result array:");
        System.out.println(Arrays.toString(intArrayTarget));*/

        //12. Вывести в консоль половину массива, среднеарифметическое которых является большим.

    }
}
