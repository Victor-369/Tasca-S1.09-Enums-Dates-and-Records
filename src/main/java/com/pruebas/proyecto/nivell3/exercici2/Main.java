package com.pruebas.proyecto.nivell3.exercici2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Erik", 30);

        System.out.println(person.sayHello());
        System.out.println("Is adult?: " + person.isAdult());
    }
}
