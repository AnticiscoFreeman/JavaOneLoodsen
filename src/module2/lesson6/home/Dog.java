package module2.lesson6.home;

public class Dog extends Animal {

    public static int countDog = 0;
    private static final String TYPE = "Пес";

    Dog(String name, int maxRun, int maxSwim) {
        super(TYPE, name, maxRun, maxSwim);
        ++countDog;
    }

}
