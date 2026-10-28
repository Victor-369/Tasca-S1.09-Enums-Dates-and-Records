package com.pruebas.proyecto.nivell3.exercici3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
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
    void constructor_notAllowedNegativeAge_throwError() {
        assertThatThrownBy(() -> new Person("Christian", -10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Age cannot be negative");
    }

    @Test
    void constructor_ageZero_isAllowed() {
        Person person = new Person("Christian", 0);
        assertThat(person.name()).isEqualTo("Christian");
        assertThat(person.age()).isZero();
    }
}
