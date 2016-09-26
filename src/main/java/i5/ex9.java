package i5;

import java.time.*;

import static java.time.temporal.ChronoUnit.SECONDS;

/**
 9. Again using stream operations, find all time zones whose offsets aren’t full
 hours.
 */
public class ex9 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        ZonedDateTime utc = now.atZone(ZoneOffset.UTC);
        System.out.println(utc);
        ZoneId.getAvailableZoneIds().stream().sorted().forEach((x) -> {
            ZonedDateTime d = utc.withZoneSameLocal(ZoneId.of(x));
            Duration dur = Duration.between(utc, d);
            long sec = dur.get(SECONDS);
            if(sec % (60*60)!=0) {
                System.out.println(d.getOffset());
            }
        });
    }
}
