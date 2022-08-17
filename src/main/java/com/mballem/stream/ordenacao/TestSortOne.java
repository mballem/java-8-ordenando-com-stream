package com.mballem.stream.ordenacao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSortOne {

    public static void main(String[] args) {
        testSortOne(MainRepository.persons());
    }

    /**
     * Listagem 2
     */
    private static void testSortOne(List<Person> persons) {
        //Usando classe anonima
        Collections.sort(persons, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
