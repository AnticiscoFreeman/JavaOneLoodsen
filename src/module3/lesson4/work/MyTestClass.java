package module3.lesson4.work;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 21.03.2025
 */

public class MyTestClass implements Comparable{

    private int value;

    public MyTestClass(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
