package java_starter.logic;

public class AndFullAndShortLogic {
    public static void main(String[] args) throws InterruptedException {
        int a = 10;

        if (a < 5 && a / 2 == 3 && longExecutionMethod()) {
            System.out.println("Yes");
        }
    }

    static boolean longExecutionMethod() throws InterruptedException {
        Thread.sleep(5000);
        return false;
    }
}
