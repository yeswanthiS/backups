package SpecialEvents

// Import statements
import kotlin.collections.mutableListOf

// Define the EventManager class that implements the Display interface
class EventManager : Display {
    // Use a mutable list to store the events
    private val events = mutableListOf<Event>()

    // Properties to store callback functions
    private var onEventAdded: ((Event) -> Unit)? = null
    private var onEventRemoved: ((Event) -> Unit)? = null

    // Method to register a callback for event addition
    fun registerOnEventAddedCallback(callback: (Event) -> Unit) {
        onEventAdded = callback
    }

    // Method to register a callback for event removal
    fun registerOnEventRemovedCallback(callback: (Event) -> Unit) {
        onEventRemoved = callback
    }

    // Method to add an event
    fun addEvent(event: Event) {
        events.add(event)
        println("Event added: ${showEventDetails(event)}")
        onEventAdded?.invoke(event)  // Notify via callback
    }

    // Method to remove an event by its ID
    fun removeEvent(eventId: Int): Boolean {
        val iterator = events.iterator()
        while (iterator.hasNext()) {
            val event = iterator.next()
            if (event.id == eventId) {
                iterator.remove()
                println("Event removed: ${showEventDetails(event)}")
                onEventRemoved?.invoke(event)  // Notify via callback
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
        if (event is SpecialEvent) {
            println("VIP List: ${event.vipList}")
            println("Premium Services: ${event.premiumServices}")
        }
    }
}