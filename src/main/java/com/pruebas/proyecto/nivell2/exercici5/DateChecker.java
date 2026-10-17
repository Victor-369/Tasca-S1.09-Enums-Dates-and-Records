package com.pruebas.proyecto.nivell2.exercici5;

import java.time.LocalDate;
import java.util.Objects;

public class DateChecker {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().minusDays(1);
        System.out.println(date + " is before today: " + isBeforeToday(date));
    }

    public static boolean isBeforeToday(LocalDate date) {
        Objects.requireNonNull(date, "date must not be null");

        return date.isBefore(LocalDate.now());
    }
}
