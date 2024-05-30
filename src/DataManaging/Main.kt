package DataManaging

// Main.kt
fun main() {
    // Create a DataManager for events
    val eventManager = DataManager<Event>()
    val event1 = Event(1, "Kotlin Conference", "2024-06-01")
    val event2 = Event(2, "Java Symposium", "2024-06-15")

    eventManager.addItem(event1)
    eventManager.addItem(event2)

    println("All Events:")
    eventManager.getAllItems().forEach { println(it) }

    eventManager.removeItem(event1)

    println("\nEvents after removal:")
    eventManager.getAllItems().forEach { println(it) }

    // Create a DataManager for attendees
    val attendeeManager = DataManager<Attendee>()
    val attendee1 = Attendee(1, "Alice", "alice@example.com")
    val attendee2 = Attendee(2, "Bob", "bob@example.com")

    attendeeManager.addItem(attendee1)
    attendeeManager.addItem(attendee2)

    println("\nAll Attendees:")
    attendeeManager.getAllItems().forEach { println(it) }

    attendeeManager.removeItem(attendee1)

    println("\nAttendees after removal:")
    attendeeManager.getAllItems().forEach { println(it) }
}