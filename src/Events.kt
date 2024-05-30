
data class Event(val id: Int, val name: String, val description: String)
class EventManager {
    // Use a mutable list to store the events
    private val events = mutableListOf<Event>()

    // Method to add an event
    fun addEvent(event: Event) {
        events.add(event)
        println("Event added: $event")
    }

    // Method to remove an event by its ID
    fun removeEvent(eventId: Int): Boolean {
        val iterator = events.iterator()
        while (iterator.hasNext()) {
            val event = iterator.next()
            if (event.id == eventId) {
                iterator.remove()
                println("Event removed: $event")
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
                println(event)
            }
        }
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