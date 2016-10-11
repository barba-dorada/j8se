package i5;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.util.function.Function;
import java.util.function.Predicate;


/**
 3. Implement a method next that takes a Predicate<LocalDate> and returns an
 adjuster yielding the next date fulfilling the predicate. For example,
 today.with(next(w -> getDayOfWeek().getValue() < 6))
 computes the next workday.
 */
public class ex3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate backToHoliday = today.with(next(w-> w.getDayOfWeek().getValue() >= 6));
        System.out.println(backToHoliday);

        LocalDate backToWork = today.with(next(w-> w.getDayOfWeek().getValue() < 6));
        System.out.println(backToWork);

    }

    static TemporalAdjuster next( Function<LocalDate, Boolean> function){
        TemporalAdjuster
        NEXT = w -> {
            LocalDate result = (LocalDate) w;
            do {
                result = result.plusDays(1);
            } while (!function.apply(result));
            return result;
        };
        return NEXT;
    }
}
