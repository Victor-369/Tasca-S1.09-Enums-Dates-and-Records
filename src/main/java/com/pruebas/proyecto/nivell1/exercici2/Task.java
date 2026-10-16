package com.pruebas.proyecto.nivell1.exercici2;

public final class Task {
    private final Level level;

    public Task(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public String getAction() {
        return switch (level) {
            case LOW -> "Handle this task when convenient.";
            case MEDIUM -> "Plan this task and complete it soon.";
            case HIGH -> "Prioritise this task and complete it immediately.";
        };
    }

    public static void main(String[] args) {
        for (Level level : Level.values()) {
            Task task = new Task(level);
            System.out.println(level + ": " + task.getAction());
        }
    }
}
