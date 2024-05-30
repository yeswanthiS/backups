package Scheinterface

class schedule {
    private val events = mutableListOf<schedulable>()

    fun addEvent(event: schedulable, time: String): String {
        events.add(event)
        return event.schedule(time)
    }

    fun rescheduleEvent(event: schedulable, newTime: String): String {
        return event.reschedule(newTime)
    }

    fun listEvents(): List<schedulable> {
        return events
    }

    fun filterEventsByDate(date: String): List<schedulable> {
        return events.filter { it.getDate() == date }
    }

    fun filterEventsByType(type: String): List<schedulable> {
        return events.filter { it.getType() == type }
    }
}