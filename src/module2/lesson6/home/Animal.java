package module2.lesson6.home;

public abstract class Animal {
    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;

    private String type;
    protected String name;
    private int maxRun;
    private int maxSwim;

    public static int countAnimal = 0;

    Animal(String type, String name, int maxRun, int maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        ++countAnimal;
    }

    String getName() {
        return this.name;
    }

    String getType() {
        return this.type;
    }

    int getMaxRun() {
        return this.maxRun;
    }

    int getMaxSwim() {
        return this.maxSwim;
    }

    protected boolean run(int distance) {
        return (distance <= maxRun);
    }

    protected int swim(int distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL;
    }
}
