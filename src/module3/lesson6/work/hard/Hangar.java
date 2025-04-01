package module3.lesson6.work.hard;

import java.io.Serializable;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 01.04.2025
 */

public class Hangar implements Serializable {

    private int number;
    private String o;
    private Fly fly;

    public Hangar(int number) {
        this.number = number;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {
        return String.format("Hangar[Fly:%s]", number, fly);
    }


}
