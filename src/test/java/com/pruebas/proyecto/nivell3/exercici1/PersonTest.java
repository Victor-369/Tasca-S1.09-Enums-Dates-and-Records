package com.pruebas.proyecto.nivell3.exercici1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {
    @Test
    void constructor_withValidValues_createsPerson() {
        Person person = new Person("Elisa", 25);

        assertThat(person.name()).isEqualTo("Elisa");
        assertThat(person.age()).isEqualTo(25);
    }

    @Test
    void equals_withSameValues_returnsTrue() {
        Person first = new Person("Elisa", 25);
        Person second = new Person("Elisa", 25);

        assertThat(first).isEqualTo(second);
    }
}
