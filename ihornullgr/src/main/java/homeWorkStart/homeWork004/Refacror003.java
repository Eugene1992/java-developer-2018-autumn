package homeWorkStart.homeWork004;

public class Refacror003 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 22, 10, 55, 54};
        System.out.println("Максимальное " + getMaxArrayEl(arr));
        System.out.println("Минимальное " + getMinArrayEl(arr));
        System.out.println("Парные " + prepaidNumbers(arr));//????
        System.out.println("Первая половина массива " + firstMass(arr));

    }

    static String prepaidNumbers(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
               str += Integer.toString(arr[i]) + ", ";
            }
        }
        return str;
    }

    static int getMaxArrayEl(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int getMinArrayEl(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int firstMass (int[] arr){
        int firstM = arr[0];
        for (int i = 0; i < arr.length / 2; i++) {
            firstM = arr[i];
        }
        return firstM;
    }
}

