package com.starr.java8.string;

/**
 * Created by tetianad on 5/24/2017.
 */
public class JoinExample {

    public static void main(String[] args) {
        String[] names = {"Tania", "Masha", "Zoia", "Polina"};
        String sisters = String.join(", ", names);
        System.out.println(sisters);
    }
}
