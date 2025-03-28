package module3.lesson3.home;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.03.2025
 */

public class ColumnMismatchException extends RuntimeException {

    public ColumnMismatchException(String message) {
        super("Columns exception: " + message);
    }
}