package com.pruebas.proyecto.nivell1.exercici1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class DayTypePrinterTest {
    @ParameterizedTest
    @EnumSource(value = Day.class, names = {"SATURDAY", "SUNDAY"})
    void printDayType_whenDayIsSaturdayOrSunday_returnsWeekend(Day day) {
        assertThat(DayTypePrinter.printDayType(day)).isEqualTo("It's the weekend.");
    }

    @ParameterizedTest
    @EnumSource(value = Day.class, mode = EnumSource.Mode.EXCLUDE, names = {"SATURDAY", "SUNDAY"})
    void printDayType_whenDayIsMondayToFriday_returnsWorkingDay(Day day) {
        assertThat(DayTypePrinter.printDayType(day)).isEqualTo("It's a working day.");
    }

    @Test
    void values_whenCalled_returnsDaysInWeekOrder() {
        assertThat(Day.values()).containsExactly(
                Day.MONDAY,
                Day.TUESDAY,
                Day.WEDNESDAY,
                Day.THURSDAY,
                Day.FRIDAY,
                Day.SATURDAY,
                Day.SUNDAY
        );
    }
}
