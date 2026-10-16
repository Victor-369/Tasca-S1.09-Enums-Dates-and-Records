package com.pruebas.proyecto.nivell1.exercici3;

public enum Level {
    LOW("Green"),
    MEDIUM("Amber"),
    HIGH("Red");

    private final String colour;

    Level(String colour) {
        this.colour = colour;
    }

    public String getColor() {
        return colour;
    }
}
