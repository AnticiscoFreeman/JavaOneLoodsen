package module3.lesson2.work.interfaces;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 14.03.2025
 */

public interface Human{

    void walk();
    void talk();

    default void write() {
        System.out.println("write");
    }
}
