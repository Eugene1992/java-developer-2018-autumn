public class ArrayTest {
    public static void main(String[] args) {
//        int[] ints = new int[]{4, -32, 42, 12, 6, 11, -21};
        int[] ints = {4, -32, 42, 12, 6, 11, -21};

/*        ints[0] = 54;
        ints[1] = 54;
        ints[2] = 54;
        ints[3] = 54;
        ints[4] = 54;
        ints[5] = 54;
        ints[6] = 54;*/

        System.out.println(calcArrayNegativeElementsNumber(ints));
    }

    static int calcArrayNegativeElementsNumber(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if  (arr[i] < 0) {
                res++;
            }
        }
        return res;
    }

}
