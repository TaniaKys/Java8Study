package com.starr.java8.lambda.data;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {
        //ms from 01 01 1970
        Instant start = Instant.now();
        System.out.println(start);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant end = Instant.now();
        System.out.println(end);

        Duration duration = Duration.between(start, end);
        System.out.println(duration.toMillis());


    }
}
