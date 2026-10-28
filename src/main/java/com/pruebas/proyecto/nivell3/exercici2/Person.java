package com.pruebas.proyecto.nivell3.exercici2;

public record Person(String name, int age) {
    public String sayHello() {
        return "Hello I'm " + name;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}
