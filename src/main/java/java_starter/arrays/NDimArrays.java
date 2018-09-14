package java_starter.arrays;

import java.util.Arrays;

public class NDimArrays {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
//                   0  1  2
           /* 0 */  {1, 1, 9},
           /* 1 */  {1, 1, 0},
           /* 2 */  {7, 1, 0}
        };

        System.out.println(arr[0][2]);
        System.out.println(arr[2][0]);
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(arr[0]));

        int[][] arr1 = {
                {1, 2, 4, 1},
                {1, 2},
                {1, 2, 1}
        };

//        System.out.println(arr1[1][2]);

        int[][][][][][][] arr2 = new int[2][2][2][2][2][2][2];
        System.out.println(Arrays.deepToString(arr2));

        byte[][][] array = new byte[2][2][2];
        array[0][0][0] = 10;
        array[0][0][1] = 20;
        array[0][1][0] = 30;
        array[0][1][1] = 40;
        array[1][0][0] = 50;
        array[1][0][1] = 60;
        array[1][1][0] = 70;
        array[1][1][1] = 80;

    }
}
