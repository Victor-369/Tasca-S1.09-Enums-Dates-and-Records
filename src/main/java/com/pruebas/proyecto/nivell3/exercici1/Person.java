package com.pruebas.proyecto.nivell3.exercici1;

public record Person(String name, int age) {
    public Person {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name must not be blank.");
        if (age < 0) throw new IllegalArgumentException("Age must not be negative.");
    }
}
