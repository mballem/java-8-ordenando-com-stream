package com.mballem.stream.ordenacao;

import java.util.List;

public class TestSortFour {

    public static void main(String[] args) {
        testSortFour(MainRepository.persons());
    }

    /**
     * Listagem 5
     */
    private static void testSortFour(List<Person> persons) {
        persons.stream()
                .mapToInt((p) -> p.getAge())
                .sorted()
                .forEach((p) -> System.out.printf("[%s]", p));
    }
}
