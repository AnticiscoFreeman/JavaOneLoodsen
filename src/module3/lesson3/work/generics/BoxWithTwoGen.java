package module3.lesson3.work.generics;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.03.2025
 */

public class BoxWithTwoGen<T, O> {

    private T valueT;
    private O valueO;

    public BoxWithTwoGen(T valueT, O valueO) {
        this.valueT = valueT;
        this.valueO = valueO;
    }

    public T getValueT() {
        return valueT;
    }

    public O getValueO() {
        return valueO;
    }

    public String getCurrentType() {
        return String.format("My types: T - %s, O - %s",
                valueT.getClass().getName(), valueO.getClass().getName());
    }
}
