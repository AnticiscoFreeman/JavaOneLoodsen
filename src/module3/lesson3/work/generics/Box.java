package module3.lesson3.work.generics;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.03.2025
 */

public class Box<T> {

    private T object;

    public Box(T object) {
        this.object = object;
        System.out.println();
    }

    public T getObject() {
        return object;
    }

    public String getCurrentType() {
        return "My type is : " + object.getClass().getName();
    }
}
