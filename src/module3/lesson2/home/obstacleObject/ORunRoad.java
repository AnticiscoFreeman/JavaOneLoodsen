package module3.lesson2.home.obstacleObject;

import module3.lesson2.home.participants.Participant;

/**
 * JavaOneLoodsen
 *
 * @author Gladkov Alex (aka. Anticisco)
 * @version 1.0.0
 */

public class ORunRoad extends OObstacle {

    public ORunRoad() {
        super("Беговая дорожка");
        this.parameter = random.nextInt(MAX_VALUE);
    }

    public ORunRoad(int parameter) {
        super("Беговая дорожка");
        this.parameter = parameter;
    }

    @Override
    public boolean overcomeObstacle(Participant participant) {
        return participant.run(parameter);
    }
}
