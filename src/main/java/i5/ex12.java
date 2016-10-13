package i5;

import java.time.*;
import java.util.HashMap;
import java.util.Map;

/**
 12. Write a program that solves the problem described at the beginning of
 Section 5.5, “Zoned Time,” on page 109. Read a set of appointments in different
 time zones and alert the user which ones are due within the next hour in
 local time.
 */
public class ex12 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime n = ZonedDateTime.of(now, ZoneId.of("Europe/Moscow")).minusMinutes(10);

        String[] tZones = {"Asia/Yekaterinburg", "Europe/London", "Europe/Paris", "Europe/Moscow"};
        Map<String, ZonedDateTime> map = new HashMap<>();
        for (String tZone : tZones) {
            map.put(tZone, ZonedDateTime.of(now, ZoneId.of(tZone)));
        }
        map.values().stream().sorted()
                .filter(i -> i.isAfter(n) && i.isBefore(n.plusMinutes(90)))
                .forEach(i -> System.out.println(i));
    }
}
