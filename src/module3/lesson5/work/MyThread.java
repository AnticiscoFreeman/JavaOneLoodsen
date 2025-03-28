package module3.lesson5.work;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 28.03.2025
 */

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        for (long i = 0; i < 10000000000L; i++) {
            long a = i * 123099;
        }
        System.out.println(getName() + " finish!");
    }
}
