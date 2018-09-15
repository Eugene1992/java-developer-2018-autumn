package classwork03;

import java.util.Scanner;
import java.util.Random;

public class ShipBattle {


    public static void outputField(int arr[][]){
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println();
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 0){
                    System.out.print("- ");
                }
                else if(arr[i][j] == 1)
                {
                    System.out.print("X ");
                }
                else{
                    System.out.print("* ");
                }

            }
        }
        System.out.println();
    }

    public static boolean checkIfNotReapeat(int arr[][], int x, int y){
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == arr[y][x] && arr[i][j] == 1){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkIfShootLuck(int arr[][], int x, int y){
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == arr[y][x] && arr[i][j] == 1){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean isYourPositioningEnd = false;
        boolean isEnemyPositioningEnd = false;

        int[][] yourField = new int[4][4];
        int[][] enemyField = new int[4][4];

        int counter = 4;

        while (isYourPositioningEnd == false) {
            System.out.println("Введите номер строки");
            int shipCoordinateY = sc.nextInt();
            System.out.println("Введи номер столбца");
            int shipCoordinateX = sc.nextInt();
            yourField[shipCoordinateY - 1][shipCoordinateX - 1] = 1;
            outputField(yourField);
            counter--;
            if (counter == 0) {
                isYourPositioningEnd = true;
            }
        }

        counter = 4;
        while (isEnemyPositioningEnd == false) {
            int shipCoordinateY = rand.nextInt(4);
            int shipCoordinateX = rand.nextInt(4);
            System.out.println(shipCoordinateX + " ");
            System.out.println(shipCoordinateY + "\n");
            boolean check = checkIfNotReapeat(enemyField, shipCoordinateX, shipCoordinateY);
            if(check == true){
                enemyField[shipCoordinateY][shipCoordinateX] = 1;
                counter--;
            }
            if (counter == 0) {
                isEnemyPositioningEnd = true;
            }
        }
        outputField(enemyField);

        boolean endGame = false;
        int enemy_num = 4;
        int your_num = 4;
        while(endGame == false) {
            System.out.println("Введите номер строки");
            int shootCoordinateY = sc.nextInt();
            System.out.println("Введите номер столбца");
            int shootCoordinateX = sc.nextInt();
            boolean shootLuck = checkIfShootLuck(enemyField, shootCoordinateX - 1, shootCoordinateY - 1);
            if(shootLuck) {
                enemy_num--;
                System.out.println("Вражеский корабль уничтожен!!");
            }
            else{
                System.out.println("Вы промахнулись.");
            }
            enemyField[shootCoordinateY - 1][shootCoordinateX - 1] = 2;
            outputField(enemyField);



            shootCoordinateY = rand.nextInt(4);
            shootCoordinateX = rand.nextInt(4);
            System.out.println(shootCoordinateX + " ");
            System.out.println(shootCoordinateY + "\n");
            shootLuck = checkIfShootLuck(enemyField, shootCoordinateX, shootCoordinateY);
            if(shootLuck == true){
                your_num--;
                System.out.println("Враг уничтожил ваш корабль!!");
            }
            else{
                System.out.println("Враг промахнулся.");
            }
            yourField[shootCoordinateY][shootCoordinateX] = 2;
            outputField(yourField);

            if(your_num == 0 || enemy_num == 0){
                endGame = true;
            }

        }
    }
}

