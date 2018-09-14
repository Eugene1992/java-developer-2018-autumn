package java_starter.arrays;

public class ArrayIteration {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[]{1, 4, 2, 6, 2, 5, 34};

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);
//        System.out.println(arr[6]);

        arr = new int[]{1, 4, 2, 6, 2, 5, 34, 6, 4};
/*
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        int[][] arr2 = {
                {1, 4, 6, 3, 1, 4, 6, 3},
                {4, 1, 6, 7, 1, 4, 6, 3},
                {3, 2, 2, 1, 1, 4, 6, 3}
        };

       /* for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }*/

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < arr2[i].length; j++) {
                Thread.sleep(1000);
                System.out.print(" j = " + j);
            }
            System.out.println();
        }
    }
}
