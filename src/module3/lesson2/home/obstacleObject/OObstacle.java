package module3.lesson2.home.obstacleObject;

import module3.lesson2.home.participants.Participant;

import java.util.Random;

/**
 * JavaOneLoodsen
 *
 * @author Gladkov Alex (aka. Anticisco)
 * @version 1.0.0
 */

public abstract class OObstacle {

    protected static Random random = new Random();
    protected static int MAX_VALUE = 100;

    protected String name;
    protected int parameter;

    protected OObstacle(String name) {
        this.name = name;
    }

    public abstract boolean overcomeObstacle(Participant participant);

    public int getParameter() {
        return parameter;
    }

    public String getName() {
        return name;
    }
}
