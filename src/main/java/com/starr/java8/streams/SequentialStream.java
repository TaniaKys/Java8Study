package com.starr.java8.streams;

import com.starr.java8.lambda.predicate.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by tetianad on 5/19/2017.
 */
public class SequentialStream {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Tania", 25));
        persons.add(new Person("Sergey", 28));
        persons.add(new Person("Masha", 25));
        persons.add(new Person("Polina", 11));

        Predicate<Person> predicate = person -> person.getAge() >= 25;
        displayPersons(persons,predicate);
    }

    private static void displayPersons(List<Person> persons, Predicate<Person> pred){

        /*
        persons.forEach(person -> {
            if(pred.test(person)){
                System.out.println(person);
            }
        });
        */

        persons.stream()
                .filter(pred)
                .forEach(person -> System.out.println(person));
    }
}
