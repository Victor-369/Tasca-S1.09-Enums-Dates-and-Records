package com.pruebas.proyecto.nivell2.exercici4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatter {
    private static final DateTimeFormatter NUMERIC_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.UK);
    private static final DateTimeFormatter LONG_FORMAT = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.UK);
    private static final DateTimeFormatter FULL_FORMAT = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy", Locale.UK);

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 9, 5);

        System.out.println("ISO format: " + date);
        System.out.println("Numeric format: " + date.format(NUMERIC_FORMAT));
        System.out.println("Long format: " + date.format(LONG_FORMAT));
        System.out.println("Full format: " + date.format(FULL_FORMAT));
    }
}
