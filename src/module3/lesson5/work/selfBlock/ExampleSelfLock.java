package module3.lesson5.work.selfBlock;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 28.03.2025
 */

public class ExampleSelfLock {

    private static final Object LOCK1 = new Object();
    private static final Object LOCK2 = new Object();

    public static void main(String[] args) {

        MyThreadLock1 t1 = new MyThreadLock1();
        MyThreadLock2 t2 = new MyThreadLock2();
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName() + " finished");
    }

    public static class MyThreadLock1 extends Thread {
        @Override
        public void run() {
            synchronized (LOCK1) {
                System.out.println("MyThreadLock1 catch LOCK1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("MyThreadLock1 await LOCK2");
                synchronized (LOCK2) {
                    System.out.println("MyThreadLock1 catch LOCK1 & LOCK2");
                }
            }
        }
    }

    public static class MyThreadLock2 extends Thread {
        @Override
        public void run() {
            synchronized (LOCK2) {
                System.out.println("MyThreadLock2 catch LOCK2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("MyThreadLock2 await LOCK1");
                synchronized (LOCK1) {
                    System.out.println("MyThreadLock2 catch LOCK2 & LOCK1");
                }
            }
        }
    }
}
