package i5;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 1. Compute Programmer’s Day without using plusDays.
 */
public class ex1 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now().with(ChronoField.DAY_OF_YEAR, 256);
        System.out.println(d);
    }
}
