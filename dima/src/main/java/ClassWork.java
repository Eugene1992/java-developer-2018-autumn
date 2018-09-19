import java.util.Scanner;

public class ClassWork {
    //Масивы//
    public static void main(String[] args) {
        int[] array = {4, 8, 1, 9, 24, 1, 8};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(+sum);

        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int x = s.nextInt();
        int[] mas = new int[x];
        int max = mas[0];
        System.out.println("Введите числа масива");
        for (int z = 0; z < mas.length; z++) {
            mas[z] = s.nextInt();
        }
        for (int z = 0; z < mas.length; z++) {
            if (mas[z] > max)
                max = mas[z];
        }
        System.out.println(" Максимальное число масива " + max);
    }
}