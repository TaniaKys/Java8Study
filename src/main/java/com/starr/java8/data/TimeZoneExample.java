package com.starr.java8.data;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;

class TimeZoneExample {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE.ofLocalizedDateTime((FormatStyle.SHORT));
        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println(formatter.format(currentDT));

        ZonedDateTime zoneDT = ZonedDateTime.now(ZoneId.of("GMT+0"));
        System.out.println(formatter.format(zoneDT));

        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(formatter.format(newYork));

        Set<String> zones = ZoneId.getAvailableZoneIds();
        zones.forEach(z -> System.out.println(z));

        System.out.println("----------------------");

        Predicate<String> condition = s -> s.contains("London");
        zones.forEach(z -> {
            if(condition.test(z)){
                System.out.println(z);
            }
        });
    }

}
