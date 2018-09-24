package workPracticeStart;

public class ArraysWork2 {
    public static void main(String[] args) {
        int arr[] = new int[3];

        arr[0] = 555;
        arr[1] = 666;
        arr[2] = 444;

        if (arr[0] > arr[1]) {
            System.out.println(arr[0] + " переменная больше всех");
        } else if (arr[1] > arr[2]) {
            System.out.println(arr[1] + " переменная больше всех");
        } else if (arr[2] > arr[0]) {
            System.out.println(arr[2] + " переменная больше всех");
        }

    }
}
