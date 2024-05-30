package Assignments

import java.util.Scanner

fun createEvent() {
    val scanner = Scanner(System.`in`)
    println("Let's create a new event!")

    print("Enter the name of the event: ")
    val eventName = scanner.nextLine()

    print("Enter the date of the event (e.g., DD/MM/YYYY): ")
    val eventDate = scanner.nextLine()

    print("Enter the location of the event: ")
    val eventLocation = scanner.nextLine()

    println("\nEvent Created Successfully!")
    println("Event Name: $eventName")
    println("Date: $eventDate")
    println("Location: $eventLocation")
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("Welcome to Event Planner!")

    var choice: String

    while (true) {
        println("\nWhat would you like to do?")
        println("1. Create a new event")
        println("2. Exit")
        print("Enter your choice: ")

        choice = scanner.nextLine()

        if (choice == "1") {
            createEvent()
        } else if (choice == "2") {
            println("Exiting Event Planner. Goodbye!")
            break
        } else {
            println("Invalid choice. Please enter 1 or 2.")
        }
    }
}