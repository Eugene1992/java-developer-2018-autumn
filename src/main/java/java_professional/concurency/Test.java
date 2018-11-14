package java_professional.concurency;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        /*for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }*/


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }

        });
//        thread2.setPriority(1);
        thread2.setName("1");
        thread2.start();

        thread2.interrupt();

        Thread thread1 = new MyThread();
        thread1.setName("10");
//        thread1.setPriority(10);
        thread1.start();
        thread2.join();
        thread1.join();
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    static class MyThread extends Thread {
        @Override
        public void run() {

            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }

        }
    }
}
