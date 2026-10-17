package com.pruebas.proyecto.nivell2.exercici6;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AppointmentAgendaTest {
    @Test
    void getUpcomingAppointments_whenAgendaContainsPastAndFutureAppointments_returnsFutureAppointmentsInChronologicalOrder() {
        LocalDateTime reference = LocalDateTime.of(2025, 6, 10, 12, 0);
        LocalDateTime earlierAppointment = reference.minusDays(1);
        LocalDateTime laterAppointment = reference.plusDays(2);
        LocalDateTime nearerAppointment = reference.plusHours(1);

        AppointmentAgenda agenda = new AppointmentAgenda();
        agenda.addAppointment(laterAppointment);
        agenda.addAppointment(earlierAppointment);
        agenda.addAppointment(nearerAppointment);
        agenda.addAppointment(reference);

        assertThat(agenda.getUpcomingAppointments(reference))
                .containsExactly(nearerAppointment, laterAppointment);
    }

    @Test
    void getUpcomingAppointments_whenNoAppointmentsAreUpcoming_returnsEmptyList() {
        AppointmentAgenda agenda = new AppointmentAgenda();
        LocalDateTime reference = LocalDateTime.of(2025, 6, 10, 12, 0);
        agenda.addAppointment(reference.minusMinutes(1));
        agenda.addAppointment(reference);

        assertThat(agenda.getUpcomingAppointments(reference)).isEqualTo(List.of());
    }
}
