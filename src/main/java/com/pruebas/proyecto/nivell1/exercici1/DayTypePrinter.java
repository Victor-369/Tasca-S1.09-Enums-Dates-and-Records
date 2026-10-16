package com.pruebas.proyecto.nivell1.exercici1;

import java.util.Objects;

public final class DayTypePrinter {
    public static void main(String[] args) {
        System.out.println(printDayType(Day.SATURDAY));
    }

    public static String printDayType(Day day) {
        Objects.requireNonNull(day, "day must not be null");

        String message;
        if (day == Day.SATURDAY || day == Day.SUNDAY) {
            message = "It's the weekend.";
        } else {
            message = "It's a working day.";
        }

        return message;
    }
}
