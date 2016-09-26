package i5;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * 8. Obtain the offsets of today’s date in all supported time zones for the current
 * time instant, turning ZoneId.getAvailableIds into a stream and using stream
 * operations.
 */
public class ex8_1 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        ZonedDateTime utc = now.atZone(ZoneOffset.UTC);
        System.out.println(utc);
        ZoneId.getAvailableZoneIds().stream().sorted().forEach((x) -> {
            ZonedDateTime i = utc.withZoneSameInstant(ZoneId.of(x));
            ZonedDateTime l = utc.withZoneSameLocal(ZoneId.of(x));
                System.out.printf("i:%-55s %7s  l:%-55s %7s\n",i,i.getOffset(),l,l.getOffset());
        });
    }
}
