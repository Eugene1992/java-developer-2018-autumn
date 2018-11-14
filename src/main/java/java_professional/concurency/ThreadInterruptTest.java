package java_professional.concurency;

public class ThreadInterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(100);
    }
}