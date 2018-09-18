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
        //2//
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
        int array5[] = {3, 7, 1, 83, 49, 14, 50,};
        int sum = 0;
        System.out.println("");
        System.out.println("Масив");
        System.out.println("Сума елементов");
        for (int a5 = 0; a5 < array5.length; a5++) {
            sum = sum + array5[a5];
        }
        System.out.println("" + sum);
    }
}



