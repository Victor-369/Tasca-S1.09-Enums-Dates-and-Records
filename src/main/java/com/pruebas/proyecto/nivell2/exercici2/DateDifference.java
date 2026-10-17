package com.pruebas.proyecto.nivell2.exercici2;

import java.time.LocalDate;
import java.time.Period;

public class DateDifference {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 15);
        LocalDate endDate = LocalDate.of(2025, 3, 20);
        Period difference = Period.between(startDate, endDate);

        System.out.println("Difference between " + startDate + " and " + endDate + ": "
                + formatComponent(difference.getYears(), "year") + ", "
                + formatComponent(difference.getMonths(), "month") + " and "
                + formatComponent(difference.getDays(), "day") + ".");
    }

    private static String formatComponent(int value, String unit) {
        return value + " " + unit + (value == 1 ? "" : "s");
    }
}
