package module3.lesson2.home;

import java.util.Random;

/**
 * JavaOneLoodsen
 *
 * @author Gladkov Alex (aka. Anticisco)
 * @version 1.0.0
 */

public interface Common {

    Random RANDOM = new Random();
    int MAX_VALUE = 100;

    default int getRandomValue() {
        return RANDOM.nextInt(MAX_VALUE);
    }
}
