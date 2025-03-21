package module3.lesson2.home.participants;

import module3.lesson2.home.Common;

/**
 * JavaOneLoodsen
 *
 * @author Gladkov Alex (aka. Anticisco)
 * @version 1.0.0
 */

public interface Participant extends Common {

    String getName();

    int getMaxRunDistance();

    int getMaxJumpDistance();

    boolean run(int distance);

    boolean jump(int height);
}
