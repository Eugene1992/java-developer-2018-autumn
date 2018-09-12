package java_starter.loops;

public class AllLoopsCompare {
    public static void main(String[] args) {
        int whileCount = 0;
        while (whileCount < 10) {
            System.out.print(whileCount + " ");
            whileCount++;
        }

        System.out.println();

        int doWhileCount = 0;
        do {
            System.out.print(doWhileCount + " ");
            doWhileCount++;
        } while (doWhileCount < 10);

        System.out.println();

        for (int forCount = 0; forCount < 10; forCount++) {
            System.out.print(forCount + " ");
        }
    }
}
