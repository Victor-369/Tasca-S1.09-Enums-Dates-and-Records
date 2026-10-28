package com.pruebas.proyecto.nivell3.exercici1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PersonTest {
    @Test
    void constructor_whenNameIsNull_throwsAnException() {
        assertThatThrownBy(() -> new Person(null, 25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Name must not be blank.");
    }

    @Test
    void constructor_whenNameIsBlank_throwsAnException() {
        assertThatThrownBy(() -> new Person("  ", 25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Name must not be blank.");
    }

    @Test
    void constructor_whenAgeIsNegative_throwsAnException() {
        assertThatThrownBy(() -> new Person("Elisa", -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Age must not be negative.");
    }

    @Test
    void constructor_whenNameIsPresentAndAgeIsZero_createsPerson() {
        Person person = new Person("Elisa", 0);

        assertThat(person.name()).isEqualTo("Elisa");
        assertThat(person.age()).isZero();
    }
}
