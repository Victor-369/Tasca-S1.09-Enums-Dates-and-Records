package com.pruebas.proyecto.nivell1.exercici3;

public final class LevelDemo {
    private LevelDemo() {
    }

    public static void main(String[] args) {
        for (Level level : Level.values()) {
            System.out.println(level + ": " + level.getColor());
        }
    }
}
