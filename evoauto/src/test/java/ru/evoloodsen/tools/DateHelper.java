package ru.evoloodsen.tools;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * JavaOneLoodsen
 *
 * @author Gladkov Alex (aka. Anticisco)
 * @version 1.0.0
 */

public class DateHelper {

    public final static Locale RU_LOCALE = new Locale("ru");

    public static String transformLocalDateToString(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern, RU_LOCALE));
    }
}
