package module3.lesson2.interfaces;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 14.03.2025
 */

public class Minotaur implements Human, Cow {

    private int hp;

    @Override
    public void write() {
        System.out.println("Minotaur write");
    }

    @Override
    public void walk() {
        System.out.println("walk");
    }

    @Override
    public void talk() {
        System.out.println("talk");
    }

    @Override
    public void muuuu() {
        System.out.println("muuuu");
    }

    @Override
    public void fight() {
        System.out.println("fight");
    }
}
