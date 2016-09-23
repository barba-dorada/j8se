package i5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 10. Your flight from Los Angeles to Frankfurt leaves at 3:05 pm local time and
 * takes 10 hours and 50 minutes. When does it arrive? Write a program that
 * can handle calculations like this.
 */
public class ex10 {
    public static void main(String[] args) {
        ZonedDateTime depLosAngeles = LocalDateTime.parse("2007-12-03T15:25:00").atZone(ZoneId.of("America/Los_Angeles"));
        Duration dur = Duration.parse("PT10H50M");
        ZonedDateTime ff = depLosAngeles.plus(dur).withZoneSameInstant(ZoneId.of("Europe/Berlin"));
        System.out.println("departure: " + depLosAngeles + "\n      dur: " + dur + "\n   arrive: " + ff);
    }
}
