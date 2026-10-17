# Level 2, Exercise 6: Appointment agenda

## Exercise

Create an agenda with appointments stored as `LocalDateTime` values and display the upcoming appointments.

## Implementation

`AppointmentAgenda` stores appointments as `LocalDateTime`. `getUpcomingAppointments(LocalDateTime)` returns appointments 
strictly after the supplied reference date and time, in chronological order. `showUpcomingAppointments()` uses the current 
date and time and prints the upcoming appointments, or a message if there are none.

Run `AppointmentAgenda.main()` to see a sample agenda. It adds three appointments relative to the current time, so the 
displayed values will vary.
