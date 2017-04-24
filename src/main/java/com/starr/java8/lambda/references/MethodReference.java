package com.starr.java8.lambda.references;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Tania", 25));
        persons.add(new Person("Masha", 25));
        persons.add(new Person("Sergey", 28));
        persons.add(new Person("Zoya", 29));
        persons.add(new Person("polina", 11));

        //static method reference
        Collections.sort(persons, Person::compareAges);

        //instance method reference
        MethodReference ref = new MethodReference();
        Collections.sort(persons, ref ::compareAges);

        persons.forEach(person -> System.out.println(person));
    }

    public int compareAges(Person p1, Person p2){
        Integer age1 = p1.getAge();
        return age1.compareTo((p2.getAge()));
    }
}
