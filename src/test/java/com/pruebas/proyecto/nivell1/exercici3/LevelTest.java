package com.pruebas.proyecto.nivell1.exercici3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class LevelTest {
    @ParameterizedTest
    @CsvSource({
            "LOW, Green",
            "MEDIUM, Amber",
            "HIGH, Red"
    })
    void getColor_whenCalledForEachLevel_returnsAssociatedColour(Level level, String expectedColour) {
        assertThat(level.getColor()).isEqualTo(expectedColour);
    }
}
