package com.pruebas.proyecto.nivell3.exercici2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PersonTest {
    @Test
    void constructor_whenNameIsNull_throwsAnException() {
        assertThatThrownBy(() -> new com.pruebas.proyecto.nivell3.exercici1.Person(null, 25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Name must not be blank.");
    }

    @Test
    void constructor_whenNameIsBlank_throwsAnException() {
        assertThatThrownBy(() -> new com.pruebas.proyecto.nivell3.exercici1.Person("  ", 25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Name must not be blank.");
    }

    @Test
    void constructor_whenAgeIsNegative_throwsAnException() {
        assertThatThrownBy(() -> new com.pruebas.proyecto.nivell3.exercici1.Person("Elisa", -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Age must not be negative.");
    }

    @Test
    void constructor_whenNameIsPresentAndAgeIsZero_createsPerson() {
        Person person = new Person("Ivan", 0);

        assertThat(person.name()).isEqualTo("Ivan");
        assertThat(person.age()).isZero();
    }

    @Test
    void sayHello_whenCalled_saysName() {
        Person person = new Person("Alfred", 40);

        assertThat(person.sayHello()).isEqualTo("Hello I'm Alfred");
    }

    @Test
    void isAdult_whenCalled_returnTrue() {
        Person person = new Person("Christian", 20);

        assertThat(person.isAdult()).isTrue();
    }
}