package NullSaftey

import java.text.SimpleDateFormat
import java.util.Date

class Schedule {
    private val events = DataManager<Event>()
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd")

    fun addEvent(event: Event): String {
        return try {
            // Parse the date to check if it's valid
            event.date?.let { dateFormat.parse(it) }
            events.addItem(event)
            "Event added: ${event.name} on ${event.date ?: "Date not specified"}"
        } catch (e: Exception) {
            "Error adding event: Invalid date format for event ${event.name}"
        }
    }

    fun removeEvent(event: Event): String {
        events.removeItem(event)
        return "Event removed: ${event.name}"
    }

    fun getEventById(id: Int): Event? {
        return events.getItemById(id) { it.id }
    }

    fun filterEventsByDate(date: String): List<Event> {
        return try {
            dateFormat.parse(date)  // Ensure the date is valid
            events.getAllItems().filter { it.date == date }
        } catch (e: Exception) {
            emptyList()  // Return an empty list if the date is invalid
        }
    }

    fun filterEventsByType(type: String): List<Event> {
        return events.getAllItems().filter { it.name.contains(type, ignoreCase = true) }
    }
}