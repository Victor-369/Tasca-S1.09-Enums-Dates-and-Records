package com.pruebas.proyecto.nivell1.exercici2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class TaskTest {
    @ParameterizedTest
    @EnumSource(Level.class)
    void constructor_whenGivenLevel_storesLevel(Level level) {
        Task task = new Task(level);

        assertThat(task.getLevel()).isEqualTo(level);
    }

    @Test
    void getAction_whenLevelIsLow_returnsConvenientAction() {
        assertThat(new Task(Level.LOW).getAction())
                .isEqualTo("Handle this task when convenient.");
    }

    @Test
    void getAction_whenLevelIsMedium_returnsSoonAction() {
        assertThat(new Task(Level.MEDIUM).getAction())
                .isEqualTo("Plan this task and complete it soon.");
    }

    @Test
    void getAction_whenLevelIsHigh_returnsImmediateAction() {
        assertThat(new Task(Level.HIGH).getAction())
                .isEqualTo("Prioritise this task and complete it immediately.");
    }

    @Test
    void values_whenCalled_returnsAllLevelsInPriorityOrder() {
        assertThat(Level.values()).containsExactly(Level.LOW, Level.MEDIUM, Level.HIGH);
    }
}
