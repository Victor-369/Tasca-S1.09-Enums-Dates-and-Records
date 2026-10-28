package com.pruebas.proyecto.nivell3.exercici4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
    private final List<Person> persons = List.of(
            new Person("Luisa", 20),
            new Person("Erika", 18),
            new Person("Chris", 17),
            new Person("Stef", 15)
    );

    @Test
    void filterByIsAdult_mixedAges_returnsOnlyAdults() {
        List<Person> adults = persons.stream()
                .filter(Person::isAdult)
                .toList();

        assertThat(adults).containsExactly(
                new Person("Luisa", 20),
                new Person("Erika", 18));
    }

    @Test
    void filterByNotAdult_mixedAges_returnsOnlyMinors() {
        List<Person> minors = persons.stream()
                .filter(p -> !p.isAdult())
                .toList();

        assertThat(minors).containsExactly(
                new Person("Chris", 17),
                new Person("Stef", 15));
    }
}
