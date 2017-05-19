package com.starr.java8.streams;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by tetianad on 5/19/2017.
 */
public class ComparingStreams {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        int length = 5;
        long size = 100000;

        for (int i = 0; i<size; i++){
            strings.add(getRandomString(length));
        }

        //printing an array
        System.out.println("Sequence stream started:");
        long s_time = System.currentTimeMillis();
        strings.stream().forEach(s -> System.out.println(s));
        s_time = System.currentTimeMillis() - s_time;


        System.out.println("Parallel stream started:");
        long p_time = System.currentTimeMillis();
        strings.stream().forEach(s -> System.out.println(s));
        p_time = System.currentTimeMillis() - p_time;


        System.out.println("Sequence stream time = ["+s_time+"ms]");
        System.out.println("Parallel stream time = ["+p_time+"ms]");


    }

    public static String getRandomString(int size) {
        Random randomizer = new Random();
        char chars[] = new char[size];
        for (int i = 0; i < size; i++) {
            chars[i] = (char)randomizer.nextInt(1000);
        }
        return new String(chars);
    }
}
