package i5;

import java.time.*;

/**
 * 8. Obtain the offsets of today’s date in all supported time zones for the current
 * time instant, turning ZoneId.getAvailableIds into a stream and using stream
 * operations.
 */
public class ex8 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        ZonedDateTime utc = now.atZone(ZoneOffset.UTC);
        System.out.println(utc);
        ZoneId.getAvailableZoneIds().stream().sorted().forEach((x) -> {
            System.out.println(x);
            //ZoneId.of(x).
        });
        // TODO: 22.09.2016  Obtain the offsets
        //  ZoneOffset.UTC;
    }
}
