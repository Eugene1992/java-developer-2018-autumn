package java_essential.homeworks.homework02;

import java.util.Random;

public class Help {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int k = rand.nextInt(100) + 1;
            if (k > 0 && k < 16) {
                System.out.println(k);
            }
        }
    }
}
