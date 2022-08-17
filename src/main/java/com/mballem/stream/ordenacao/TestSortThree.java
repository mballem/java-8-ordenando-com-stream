package com.mballem.stream.ordenacao;

import java.util.List;

public class TestSortThree {

    public static void main(String[] args) {
        testSortThree(MainRepository.persons());
    }

    /**
     * Listagem 4
     */
    private static void testSortThree(List<Person> persons) {
        persons.stream()
                .sorted((p1, p2) -> p1.getAge().compareTo(p2.getAge()))
                .forEach(p -> System.out.println(p));
    }
}
