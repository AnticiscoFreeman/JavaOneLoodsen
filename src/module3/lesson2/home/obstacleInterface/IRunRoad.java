package module3.lesson2.home.obstacleInterface;

import module3.lesson2.home.participants.Participant;

/**
 * JavaOneLoodsen
 *
 * @author Gladkov Alex (aka. Anticisco)
 * @version 1.0.0
 */

public class IRunRoad implements IObstacle {

    private final int width;

    public IRunRoad() {
        this.width = getRandomValue();
    }

    public IRunRoad(int width) {
        this.width = width;
    }

    @Override
    public boolean overcomeObstacle(Participant participant) {
        return participant.run(width);
    }

    @Override
    public int getParameter() {
        return width;
    }

    @Override
    public String getName() {
        return "Беговая дорожка";
    }
}
