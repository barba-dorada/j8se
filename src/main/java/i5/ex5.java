package i5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * Created by tischenko on 20.09.2016.
 */
public class ex5 {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1971, 8, 21);
        LocalDate deathDate = birthDay.plusYears(80);
        LocalDate now = LocalDate.now();

        ChronoUnit unit=DAYS;
        long period = birthDay.until(now, unit);
        long est = now.until(deathDate, unit);

        System.out.println(period+" "+unit.toString());
        System.out.println(est+" "+unit.toString());
        //final Period between = Period.between(bithDay, now);
        //System.out.println(Integer.MAX_VALUE);

    }
}
