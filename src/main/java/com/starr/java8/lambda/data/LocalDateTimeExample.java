package com.starr.java8.lambda.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate specificDate = LocalDate.of(2007, Month.AUGUST, 5);
        System.out.println(specificDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime specificTime = LocalTime.of(16, 20, 10);
        System.out.println(specificTime);

        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println(currentDT);

        LocalDateTime specificDT = LocalDateTime.of(2007, 5, 29, 16, 25, 5);
        System.out.println(specificDT);
    }

}
