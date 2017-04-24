package com.starr.java8.lambda.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by tetianad on 4/24/2017.
 */
public class FilterCollections {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Tania", 25));
        persons.add(new Person("Masha", 25));
        persons.add(new Person("Sergey", 28));
        persons.add(new Person("Zoya", 29));
        persons.add(new Person("polina", 11));

        Predicate<Person> pred1 = person -> person.getAge() > 25;
        Predicate<Person> pred2 = person -> person.getAge() <= 25;

        displayPersons(persons, pred2);
    }

    private static void displayPersons(List<Person> persons, Predicate<Person> pred){
        persons.forEach(person -> {
            if(pred.test(person)){
                System.out.println(person);
            }
        });
    }

}
