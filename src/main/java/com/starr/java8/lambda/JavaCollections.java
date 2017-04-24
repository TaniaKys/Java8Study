package com.starr.java8.lambda;

import java.util.*;

/**
 * Created by tetianad on 4/24/2017.
 */
public class JavaCollections {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("DDD");
        list.add("EEE");
        list.add("ccc");

        //simple sort
        Collections.sort(list);

        System.out.println("Simple sort:");
        //simple array print
        for (String str : list) {
            System.out.println(str);
        }

        //sort with lambda comporator v.1
        Comparator<String> comp = (str1, str2) -> {
          return str1.compareToIgnoreCase(str2);
        };
        //Collections.sort(list, comp);

        //sort with lambda comporator v.2

        Collections.sort(list, (str1, str2)->{
         return str1.compareToIgnoreCase(str2);
        });

        //sort with lambda comporator v.3 (for future)
        //Collections.sort(list, String::compareToIgnoreCase);


        System.out.println("Corporator sort:");
        //array print with lambda (using Consumer interface)
        list.forEach(str -> System.out.println(str));



    }
}
