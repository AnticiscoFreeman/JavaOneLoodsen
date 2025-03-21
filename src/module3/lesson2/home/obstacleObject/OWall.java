package module3.lesson2.home.obstacleObject;

import module3.lesson2.home.participants.Participant;

/**
 * JavaOneLoodsen
 *
 * @author Gladkov Alex (aka. Anticisco)
 * @version 1.0.0
 */

public class OWall extends OObstacle {

    public OWall() {
        super("Стена");
        this.parameter = random.nextInt(MAX_VALUE);
    }

    public OWall(int parameter) {
        super("Стена");
        this.parameter = parameter;
    }

    @Override
    public boolean overcomeObstacle(Participant participant) {
        return participant.jump(parameter);
    }
}
