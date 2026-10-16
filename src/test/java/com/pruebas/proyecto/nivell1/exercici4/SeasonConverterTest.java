package com.pruebas.proyecto.nivell1.exercici4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class SeasonConverterTest {
    @ParameterizedTest
    @CsvSource({
            "SPRING, SPRING",
            "SUMMER, SUMMER",
            "AUTUMN, AUTUMN",
            "WINTER, WINTER"
    })
    void convert_whenGivenValidName_returnsSeason(String name, Season expectedSeason) {
        assertThat(SeasonConverter.convert(name)).isEqualTo(expectedSeason);
    }

    @Test
    void convert_whenGivenInvalidName_throwsIllegalArgumentException() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> SeasonConverter.convert("monsoon"))
                .withMessage("Invalid season: monsoon");
    }

    @Test
    void convert_whenGivenLowerCaseName_throwsIllegalArgumentException() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> SeasonConverter.convert("spring"))
                .withMessage("Invalid season: spring");
    }

    @Test
    void convert_whenGivenNull_throwsIllegalArgumentException() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> SeasonConverter.convert(null))
                .withMessage("Season must not be null.");
    }
}
