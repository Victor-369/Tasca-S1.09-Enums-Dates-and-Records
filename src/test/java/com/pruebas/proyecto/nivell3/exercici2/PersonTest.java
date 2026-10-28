package com.pruebas.proyecto.nivell3.exercici2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
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