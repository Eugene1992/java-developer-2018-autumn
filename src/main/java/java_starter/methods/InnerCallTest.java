package java_starter.methods;

public class InnerCallTest {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        printStringNTimes("Hello world", 8);
        int[] arr = {2, 34, 2, 12, 64, 12, 45};
        System.out.println(calcArraySum(arr));

        int[] arr2 = {4, 5, 2};
        System.out.println(calcArraySum(arr2));
    }

    static void printStringNTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    static int calcArraySum(int[] arr) {
        return calcArraySum(arr, 0, arr.length - 1);
    }

    static double calcArrayAverage(int[] arr) {
        return calcArraySum(arr) / arr.length;
    }

    static int calcArraySum(int[] arr, int fromIndex, int toIndex) {
        int sum = 0;
        for (int i = fromIndex; i <= toIndex; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int calcFirstArrayHalf(int[] arr) {
        return calcArraySum(arr, 0, arr.length / 2);
    }

    static int calcSecondArrayHalf(int[] arr) {
        return calcArraySum(arr, arr.length / 2, arr.length - 1);
    }

    static int getMaxArrayElem(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    static int getMinArrayElem(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    static int getArrayElemIndex(int[] arr, int elemValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elemValue) {
                return i;
            }
        }
        return -1;
    }

    static int calcSumBetweenArrayMinAndMax(int[] arr) {
        int maxArrayElem = getMaxArrayElem(arr);
        int arrayMaxElemIndex = getArrayElemIndex(arr, maxArrayElem);

        int minArrayElem = getMinArrayElem(arr);
        int arrayMinElemIndex = getArrayElemIndex(arr, minArrayElem);

        if (arrayMaxElemIndex > arrayMinElemIndex) {
            return calcArraySum(arr, arrayMinElemIndex, arrayMaxElemIndex);
        } else {
            return calcArraySum(arr, arrayMaxElemIndex, arrayMinElemIndex);
        }
    }

/*    static int calcSumBetweenArrayMinAndMax(int[] arr) {
        return getArrayElemIndex(arr, getMaxArrayElem(arr)) > getArrayElemIndex(arr, getMinArrayElem(arr)) ?
                calcArraySum(arr, getArrayElemIndex(arr, getMinArrayElem(arr)), getArrayElemIndex(arr, getMaxArrayElem(arr))) :
                calcArraySum(arr, getArrayElemIndex(arr, getMaxArrayElem(arr)), getArrayElemIndex(arr, getMinArrayElem(arr)));
    }*/

    static int calcArraySum(double[] arr) {
        return 0;
    }

    static int calcArraySum(double[] arr, int toIndex) {
        return 0;
    }

    static int calcArraySum(int toIndex, double[] arr) {
        return 0;
    }
}
