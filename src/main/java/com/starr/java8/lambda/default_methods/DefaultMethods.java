package com.starr.java8.lambda.default_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by tetianad on 5/19/2017.
 */
public class DefaultMethods {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Masha", 25));
        persons.add(new Person("Sergey", 28));
        persons.add(new Person("Tania", 25));
        persons.add(new Person("Polina", 11));

        Predicate<Person> pred = (p) -> p.getAge() >=25;
        displayPersons(persons, pred);

    }

    private static void displayPersons(List<Person> persons, Predicate<Person> pred){
        persons.forEach(person -> {
            if(pred.test(person)){
                //using default method
                //System.out.println(person.getPersonInfo());

                //using static method
                System.out.println(PersonInterface.getPersonInfo(person));
            }
        });
    }

}
