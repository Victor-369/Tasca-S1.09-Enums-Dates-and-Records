package com.pruebas.proyecto.nivell2.exercici3;

import java.time.LocalDateTime;

public class DateCalculations {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 5, 15, 10, 30);

        System.out.println("Original date and time: " + dateTime);
        System.out.println("Add 10 days: " + dateTime.plusDays(10));
        System.out.println("Subtract 10 days: " + dateTime.minusDays(10));
        System.out.println("Add 2 months: " + dateTime.plusMonths(2));
        System.out.println("Subtract 2 months: " + dateTime.minusMonths(2));
        System.out.println("Add 3 hours: " + dateTime.plusHours(3));
        System.out.println("Subtract 3 hours: " + dateTime.minusHours(3));
    }
}
