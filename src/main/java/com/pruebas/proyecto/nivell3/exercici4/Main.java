package com.pruebas.proyecto.nivell3.exercici4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("Luisa", 20),
                new Person("Alfred", 34),
                new Person("Erik", 56),
                new Person("Erika", 18),
                new Person("Stef", 15),
                new Person("Chris", 16)
        );

        System.out.println("List of all people:");
        persons.forEach(System.out::println);

        System.out.println("\nList of adults:");
        persons.stream()
                .filter(p -> p.isAdult())
                .forEach(System.out::println);

        System.out.println("\nList of minors:");
        persons.stream()
                .filter(p -> !p.isAdult())
                .forEach(System.out::println);
    }
}
