package module3.lesson3.work.generics;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 18.03.2025
 */

public class UniversalBox {

    private Object object;

    public UniversalBox(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
