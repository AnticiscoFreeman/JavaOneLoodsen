package module3.lesson5.home;

import java.util.Arrays;
/**
 * 1) Создают одномерный длинный массив, например:
 * static final int size = 10000000; static final int h = size / 2; float[] arr = new float[size];
 * 2) Заполняют этот массив единицами;
 * 3) Засекают время выполнения: long a = System.currentTimeMillis();
 * 4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
 * arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
 * 5) Проверяется время окончания метода System.currentTimeMillis();
 * 6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);
 * Отличие первого метода от второго:
 * Первый просто бежит по массиву и вычисляет значения.
 * Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
 * По замерам времени:
 * Для первого метода надо считать время только на цикл расчета:
 * for (int i = 0; i < size; i++) {
 * arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
 * }
 * Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.
 */
public class Main {
    private static final int SIZE = 10000000;
    private static final int HALF_SIZE = SIZE / 2;
    private static final float[] arrayOne = new float[SIZE];
    private static final float[] arrayTwo = new float[SIZE];

    public static void main(String[] args) {

        for (int i = 0; i < arrayOne.length; i++)
            arrayOne[i] = 1f;

        Arrays.fill(arrayTwo, 1f);

        long beginTime = System.nanoTime();
        calculateArray(arrayOne);

        long deltaTime = System.nanoTime() - beginTime;
        System.out.println("One thread time: " + deltaTime * 1e-9f);

        beginTime = System.nanoTime();
        calculateArrayTwoThreads(arrayTwo);
        deltaTime = System.nanoTime() - beginTime;
        System.out.println("Two threads time: " + deltaTime * 1e-9f);

        if (Arrays.equals(arrayOne, arrayTwo)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    private static void calculateArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] *
                    Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
    }

    private static void calculateArrayTwoThreads(float[] arr) {
        final float[] a1 = new float[HALF_SIZE];
        final float[] a2 = new float[HALF_SIZE];

        System.arraycopy(arr, 0, a1, 0, HALF_SIZE);
        System.arraycopy(arr, HALF_SIZE, a2, 0, HALF_SIZE);

        CalcThread threadOne = new CalcThread(a1, 0);
        CalcThread threadTwo = new CalcThread(a2, HALF_SIZE);

        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.arraycopy(a1, 0, arr, 0, HALF_SIZE);
        System.arraycopy(a2, 0, arr, HALF_SIZE, HALF_SIZE);
    }

}
