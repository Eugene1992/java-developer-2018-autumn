package java_starter.conditions;

public class StringSwitchExample {
    public static void main(String[] args) {
        String myBeatifulLittlePonny = "F";

        if (myBeatifulLittlePonny.equals("A")) {
            System.out.println(10);
        } else if (myBeatifulLittlePonny.equals("B")) {
            System.out.println(11);
        } else if (myBeatifulLittlePonny.equals("C")) {
            System.out.println(12);
        } else if (myBeatifulLittlePonny.equals("D")) {
            System.out.println(13);
        } else if (myBeatifulLittlePonny.equals("E")) {
            System.out.println(14);
        } else if (myBeatifulLittlePonny.equals("F")) {
            System.out.println(15);
        } else {
            System.out.println("Illegal number value!");
        }

        switch (myBeatifulLittlePonny) {
            case "A":
                System.out.println(10);
                break;
            case "B":
                System.out.println(11);
                break;
            case "C":
                System.out.println(12);
                break;
            case "D":
                System.out.println(13);
                break;
            case "E":
                System.out.println(14);
                break;
            case "F":
                System.out.println(15);
                switch (myBeatifulLittlePonny){
                    case "F":
                        System.out.println("Inner");
                        break;
                }
                break;
            default:
                System.out.println("Illegal number value!");
        }
    }
}
