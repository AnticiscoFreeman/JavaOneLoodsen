package module3.lesson4.work.maps;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 21.03.2025
 */

public class ValueMap implements Comparable {

    private int value;

    public ValueMap(int value) {
        this.value = value;
    }

    public void doSomething() {
        System.out.println("Hello ValueMap");
    }

    @Override
    public int compareTo(Object o) {
        if (((ValueMap) o).value == this.value) {
            return 130;
        }

        return -1;
    }
}
