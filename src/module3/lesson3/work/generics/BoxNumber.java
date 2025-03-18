package module3.lesson3.work.generics;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.03.2025
 */

public class BoxNumber<T extends Number> {

    private T object;

    public BoxNumber(T object) {
        this.object = object;
        System.out.println();
    }

    public void sum(Integer integer) {
        System.out.println(object.intValue() + integer);
    }

    public T getObject() {
        return object;
    }

    public String getCurrentType() {
        return "My type is : " + object.getClass().getName();
    }
}
