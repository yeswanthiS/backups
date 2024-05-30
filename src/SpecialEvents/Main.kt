package SpecialEvents

// Import statements
import kotlin.collections.mutableListOf

// Main function to test the EventManager class
fun main() {
    val eventManager = EventManager()

    // Register callbacks
    eventManager.registerOnEventAddedCallback { event ->
        println("Notification: Event added - ${event.name}")
    }

    eventManager.registerOnEventRemovedCallback { event ->
        println("Notification: Event removed - ${event.name}")
    }

    val event1 = Event(1, "Conference", "Annual tech conference")
    val specialEvent = SpecialEvent(2, "VIP Gala", "Exclusive gala for VIPs")

    eventManager.addEvent(event1)
    eventManager.addEvent(specialEvent)

    specialEvent.addVip("Alice")
    specialEvent.addVip("Bob")
    specialEvent.addPremiumService("Champagne")
    specialEvent.addPremiumService("Private Concert")

    eventManager.listEvents()

    eventManager.removeEvent(1)

    eventManager.listEvents()

    eventManager.removeEvent(3)
}