package com.pruebas.proyecto.nivell2.exercici1;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTime {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();

        System.out.println("Current date: " + currentDate);
        System.out.println("Current time: " + currentTime);
        System.out.println("Current date and time: " + currentDateTime);
    }
}
