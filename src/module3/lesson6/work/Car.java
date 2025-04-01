package module3.lesson6.work;

import java.io.Serializable;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 01.04.2025
 */

public class Car implements Serializable { //ObjectInput/OutputStream

    private String color;
    private int power;

    public Car(String color, int power) {
        this.color = color;
        this.power = power;
    }

    public void beep() {
        System.out.println("Car is beeeep!");
    }

    @Override
    public String toString() {
        return String.format("Car[color:%s][power:%s]", color, power);
    }
}
