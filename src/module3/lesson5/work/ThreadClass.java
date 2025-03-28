package module3.lesson5.work;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 28.03.2025
 */

public class ThreadClass {

    private static int a = 0;
    private static int b = 0;
    private static int c = 0;

    private static final Object monitor = new Object();

    public static void main(String[] args) {
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    System.out.println("MyThread from Runnable");
//                }
//            }
//        };
//
//        new Thread(r).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    System.out.println("MyThread from Thread Runnable");
//                }
//            }
//        }).start();
//        MyThread t1 = new MyThread("Thread-1");
//        MyThread t2 = new MyThread("Thread-2");
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e ) {
//            e.printStackTrace();
//        }

//        System.out.println("I here start");
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("I here finish");
        Runnable r = new Runnable() { // Runnable rLambda = () -> sum();
            @Override
            public void run() {
                sum();
            }
        };

        new Thread(r, "Thread 1").start();
        new Thread(r, "Thread 2").start();
        new Thread(r, "Thread 3").start();

        System.out.println(Thread.currentThread().getName() + " finish");
    }

    private synchronized static void sum() {
        for (int i = 0; i < 1000000; i++) {
            a = a + 1;
            b = b + 1;
            c = c + 1;
        }

        String result = String.format("a = %d, b = %d, c = %d", a, b, c);
        System.out.println(result);
    }
}

/**
 * 1) Создают одномерный длинный массив, например:
 * static final int size = 10000000;
 * static final int h = size / 2;
 * float[] arr = new float[size];
 * 2) Заполняют этот массив единицами;
 * 3) Засекают время выполнения: long a = System.currentTimeMillis();
 * 4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
 * arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
 * 5) Проверяется время окончания метода System.currentTimeMillis();
 * 6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);
 * Отличие первого метода от второго:
 * Первый просто бежит по массиву и вычисляет значения.
 * Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
 * Пример деления одного массива на два:
 * System.arraycopy(arr, 0, a1, 0, h);
 * System.arraycopy(arr, h, a2, 0, h);
 * Пример обратной склейки:
 * System.arraycopy(a1, 0, arr, 0, h);
 * System.arraycopy(a2, 0, arr, h, h);
 * Примечание:
 * System.arraycopy() – копирует данные из одного массива в другой:
 * System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
 * По замерам времени:
 * Для первого метода надо считать время только на цикл расчета:
 * for (int i = 0; i < size; i++) {
 * arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
 * }
 * Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.
 */
