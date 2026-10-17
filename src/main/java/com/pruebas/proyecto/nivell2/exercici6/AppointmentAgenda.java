package com.pruebas.proyecto.nivell2.exercici6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AppointmentAgenda {
    private final List<LocalDateTime> appointments = new ArrayList<>();

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        AppointmentAgenda agenda = new AppointmentAgenda();
        agenda.addAppointment(now.minusDays(1));
        agenda.addAppointment(now.plusHours(1));
        agenda.addAppointment(now.plusDays(2));
        agenda.addAppointment(now.plusDays(3));

        agenda.showUpcomingAppointments();
    }

    public void addAppointment(LocalDateTime appointment) {
        Objects.requireNonNull(appointment, "appointment must not be null");
        appointments.add(appointment);
    }

    public List<LocalDateTime> getUpcomingAppointments(LocalDateTime from) {
        Objects.requireNonNull(from, "from must not be null");
        
        return appointments.stream()
                .filter(appointment -> appointment.isAfter(from))
                .sorted()
                .toList();
    }

    public void showUpcomingAppointments() {
        List<LocalDateTime> upcomingAppointments = getUpcomingAppointments(LocalDateTime.now());
        if (upcomingAppointments.isEmpty()) {
            System.out.println("No upcoming appointments.");

            return;
        }

        System.out.println("Upcoming appointments:");
        upcomingAppointments.forEach(System.out::println);
    }
}
