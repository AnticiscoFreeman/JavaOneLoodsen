package module3.lesson2.work.interfaces;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 14.03.2025
 */

public class CowObject implements Cow {
    @Override
    public void muuuu() {
        System.out.println("muuuu");
    }

    @Override
    public void fight() {
        System.out.println("fight");
    }
}
