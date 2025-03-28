package module3.lesson3.home;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.03.2025
 */

public class RowMismatchException extends RuntimeException {

    public RowMismatchException(String message) {
        super("Rows exception: " + message);
    }
}
