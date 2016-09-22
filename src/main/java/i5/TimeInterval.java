package i5;

import java.time.LocalTime;


/**
 * 7. Implement a TimeInterval class that represents an interval of time, suitable for
 * calendar events (such as a meeting on a given date from 10:00 to 11:00).
 * Provide a method to check whether two intervals overlap.
 */


class TimeInterval {
    private LocalTime start;
    private LocalTime end;

    private TimeInterval() {
    }

    public static TimeInterval of(String interval) {
        String[] i = interval.split("-");
        TimeInterval ti = new TimeInterval();
        ti.start = LocalTime.parse(i[0]);
        ti.end = LocalTime.parse(i[1]);
        return ti;
    }

    public boolean overlap(TimeInterval ti) {
        if (start.compareTo(ti.start) >= 0 && start.compareTo(ti.end) < 0) return true;
        if (ti.start.compareTo(start) >= 0 && ti.start.compareTo(end) < 0) return true;
        return false;
    }
}
