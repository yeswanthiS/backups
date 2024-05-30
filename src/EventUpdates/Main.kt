package EventUpdates

fun main() {
    val eventManager = EventManager()

    // Register notification for event added
    eventManager.onEventAdded { event ->
        println("Notification: Event added - ${event.name} on ${event.date}")
    }

    // Register notification for event removed
    eventManager.onEventRemoved { event ->
        println("Notification: Event removed - ${event.name} on ${event.date}")
    }

    eventManager.addEvent(1, "Kotlin Conference", "2024-05-20")
    eventManager.addEvent(2, "Android Summit", "2024-06-15")
    eventManager.listEvents()
    eventManager.removeEvent(1)
    eventManager.listEvents()
}