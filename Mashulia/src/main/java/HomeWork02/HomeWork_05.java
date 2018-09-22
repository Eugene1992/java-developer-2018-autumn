package HomeWork02;

public class HomeWork_05 {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= 20; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
}

//5. Выведите на экран первые 20 членов последовательности Фибоначчи.