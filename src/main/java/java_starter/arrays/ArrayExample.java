package java_starter.arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        boolean[] booleans = new boolean[2];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(booleans));

        int[] arr2 = new int[2];

        arr2[0] = 10;
        arr2[1] = 20;
//        arr2[2] = 30;

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
}
