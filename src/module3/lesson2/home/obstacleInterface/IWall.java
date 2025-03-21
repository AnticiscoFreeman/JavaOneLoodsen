package module3.lesson2.home.obstacleInterface;

import module3.lesson2.home.participants.Participant;

/**
 * JavaOneLoodsen
 *
 * @author Gladkov Alex (aka. Anticisco)
 * @version 1.0.0
 */

public class IWall implements IObstacle {

    private final int height;

    public IWall() {
        this.height = getRandomValue();
    }

    public IWall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcomeObstacle(Participant participant) {
        return participant.jump(height);
    }

    @Override
    public int getParameter() {
        return height;
    }

    @Override
    public String getName() {
        return "Стена";
    }
}
