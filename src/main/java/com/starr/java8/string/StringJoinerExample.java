package com.starr.java8.string;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        joiner.setEmptyValue("No values yet");
        System.out.println(joiner);

        joiner.add("Tania")
                .add("Masha")
                .add("Zoia")
                .add("Polina");
        System.out.println(joiner);

    }
}
