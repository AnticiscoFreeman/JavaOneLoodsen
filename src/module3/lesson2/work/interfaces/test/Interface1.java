package module3.lesson2.work.interfaces.test;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 14.03.2025
 */

public interface Interface1 {

    void read();

    default void write() {
        System.out.println("write1");
    }
}
