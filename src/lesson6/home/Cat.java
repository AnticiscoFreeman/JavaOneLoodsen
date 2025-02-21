package lesson6.home;

public class Cat extends Animal {

    public static int countCat = 0;
    private static final String TYPE = "Кот";

    Cat(String name, int maxRun, int maxSwim) {
        super(TYPE, name, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    protected int swim(int distance) {
        return Animal.SWIM_NONE;
    }

}
