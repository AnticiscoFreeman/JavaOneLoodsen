package module3.lesson2.home.obstacleInterface;

import module3.lesson2.home.Common;
import module3.lesson2.home.participants.Participant;

/**
 * JavaOneLoodsen
 *
 * @author Gladkov Alex (aka. Anticisco)
 * @version 1.0.0
 */

public interface IObstacle extends Common {

    boolean overcomeObstacle(Participant participant);

    int getParameter();

    String getName();
}
