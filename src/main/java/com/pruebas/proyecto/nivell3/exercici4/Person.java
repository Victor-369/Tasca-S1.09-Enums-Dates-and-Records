package com.pruebas.proyecto.nivell3.exercici4;

public record Person(String name, int age) {
    public static final int ADULT_AGE = 18;

    public boolean isAdult() {
        return age >= ADULT_AGE;
    }
}
