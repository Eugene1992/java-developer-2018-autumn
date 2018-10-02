package java_starter.homework03;

import java.util.Arrays;

public class ClassTest {
    public static void main(String[] args) {
//        1. Sum element
        int k = (int) (Math.random() * 10);
        int[] arr = new int[k];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(k);
        System.out.println(sum);

//        2.Max element
        int j = (int) (Math.random() * 10);
        System.out.println(j);
        int[] secondArr = new int[j];
        int max = 0;
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = (int) (Math.random() * 10);
            if (max < secondArr[i]) {
                max = secondArr[i];
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(secondArr));
    }
}
