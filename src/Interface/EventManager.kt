package Interface

import Event
class EventManager : Display {
    private val events = mutableListOf<Event>()

    fun addEvent(event: Event) {
        events.add(event)
        println("Event added: ${showEventDetails(event)}")
    }

    // Method to remove an event by its ID
    fun removeEvent(eventId: Int): Boolean {
        val iterator = events.iterator()
        while (iterator.hasNext()) {
            val event = iterator.next()
            if (event.id == eventId) {
                iterator.remove()
                println("Event removed: ${showEventDetails(event)}")
                return true
            }
        }
        println("Event with ID $eventId not found.")
        return false
    }

    // Method to list all events
    fun listEvents() {
        if (events.isEmpty()) {
            println("No events available.")
        } else {
            println("Listing all events:")
            for (event in events) {
                showEventDetails(event)
            }
        }
    }

    // Implement the showEventDetails method from the Display interface
    override fun showEventDetails(event: Event) {
        println("Event Details - ID: ${event.id}, Name: ${event.name}, Description: ${event.description}")
    }
}

// Main function to test the EventManager class
fun main() {
    val eventManager = EventManager()

    val event1 = Event(1, "Conference", "Annual tech conference")
    val event2 = Event(2, "Workshop", "Kotlin workshop")

    eventManager.addEvent(event1)
    eventManager.addEvent(event2)

    eventManager.listEvents()

    eventManager.removeEvent(1)

    eventManager.listEvents()

    eventManager.removeEvent(3)
}