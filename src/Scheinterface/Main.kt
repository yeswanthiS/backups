package Scheinterface

fun main() {
    val schedule = schedule()

    val meeting1 = meeting("2024-05-20 10:00")
    val appointment1 = appointment("2024-05-20 15:00")
    val meeting2 = meeting("2024-05-21 09:00")
    val appointment2 = appointment("2024-05-21 14:00")

    schedule.addEvent(meeting1, "2024-05-20 10:00")
    schedule.addEvent(appointment1, "2024-05-20 15:00")
    schedule.addEvent(meeting2, "2024-05-21 09:00")
    schedule.addEvent(appointment2, "2024-05-21 14:00")

    println("Events on 2024-05-20:")
    schedule.filterEventsByDate("2024-05-20").forEach { event ->
        println("${event.getType()} at ${event.getDate()}")
    }

    println("\nAppointments:")
    schedule.filterEventsByType("Appointment").forEach { event ->
        println("${event.getType()} at ${event.getDate()}")
    }
}