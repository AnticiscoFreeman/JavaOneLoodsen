package module3.lesson3.home;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.03.2025
 */

public class NumberIsNotNumberException extends RuntimeException {

    NumberIsNotNumberException(String message) {
        super("Not a number found: " + message);
    }
}
