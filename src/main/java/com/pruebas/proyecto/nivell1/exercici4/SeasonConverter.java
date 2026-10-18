package com.pruebas.proyecto.nivell1.exercici4;

public final class SeasonConverter {
    private SeasonConverter() {
    }

    public static Season convert(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Season must not be null.");
        }

        try {
            return Season.valueOf(value);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException("Invalid season: " + value, exception);
        }
    }

    public static void main(String[] args) {
        System.out.println(convert("SPRING"));

        try {
            System.out.println(convert("monsoon"));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
