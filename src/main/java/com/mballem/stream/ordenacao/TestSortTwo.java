package com.mballem.stream.ordenacao;

import java.util.List;

public class TestSortTwo {

    public static void main(String[] args) {
        testSortTwo(MainRepository.persons());
        System.out.println(" ---- ---- ---- ---- ---- ");
        testSortTwoInverse(MainRepository.persons());
    }

    /**
     * Listagem 3
     */
    private static void testSortTwo(List<Person> persons) {
        persons.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(p -> System.out.println(p));
    }

    /**
     * Ordem inversao
     */
    private static void testSortTwoInverse(List<Person> persons) {
        persons.stream()
                .sorted((p1, p2) -> p2.getName().compareTo(p1.getName()))
                .forEach(p -> System.out.println(p));
    }
}
