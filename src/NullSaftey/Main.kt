package NullSaftey

fun main() {
    val event1 = Event(1, "Kotlin Conference", "2024-06-01")
    val event2 = Event(2, "Java Symposium", "2024-06-15")

    // Add tags to events
    event1.addTag("Tech")
    event1.addTag("Conference")
    event2.addTag("Programming")

    // Set categories for events
    event1.setCategory("Technology")
    event2.setCategory("Education")

    // Print event details
    println("Event 1: ${event1.name}, Date: ${event1.date}, Tags: ${event1.tags}, Category: ${event1.category}")
    println("Event 2: ${event2.name}, Date: ${event2.date}, Tags: ${event2.tags}, Category: ${event2.category}")

    // Remove a tag from an event
    event1.removeTag("Conference")
    println("Event 1 after removing a tag: ${event1.name}, Tags: ${event1.tags}")

    // Clear category from an event
    event2.clearCategory()
    println("Event 2 after clearing category: ${event2.name}, Category: ${event2.category}")
}