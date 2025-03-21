package module3.lesson2.home.participants;

/**
 * JavaOneLoodsen
 *
 * @author Gladkov Alex (aka. Anticisco)
 * @version 1.0.0
 */

public class Cat implements Participant {

    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Cat() {
        this.maxRunDistance = getRandomValue();
        this.maxJumpHeight = getRandomValue();
    }

    @Override
    public String getName() {
        return "Cat";
    }

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public int getMaxJumpDistance() {
        return maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        return maxRunDistance >= distance;
    }

    @Override
    public boolean jump(int height) {
        return maxJumpHeight >= height;
    }
}
