package homeWorkEssential.seaBattle;

//1. Класс Map, рисует себя и все что на нем находится
//2. Класс Ship, рисует корабли в map

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean done = false;

        System.out.println("MyMap");
        System.out.println("Для выхода нажмите - q");
        Map playerMap = new Map();
        playerMap.draw();
        System.out.println("");

        System.out.println("Comp");
        Map computerMap = new Map();
        computerMap.draw();

    }
}
