package com.pruebas.proyecto.nivell3.exercici2;

public class Main {
    public static void main(String[] args) {
        Person personErik = new Person("Erik", 30);
        System.out.println(personErik.sayHello());
        System.out.println("Is adult?: " + personErik.isAdult());

        Person personElissa = new Person("Elissa", 15);
        System.out.println(personElissa.sayHello());
        System.out.println("Is adult?: " + personElissa.isAdult());
    }
}
