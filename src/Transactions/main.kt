package Transactions

import java.util.Date

fun main() {
    val transaction1 = Transaction(30.0, Date(), "Bakery")
    println("Transaction 1 Category: ${transaction1.categorizeTransaction()}")

    val transaction2 = Transaction(150.0, Date(), "Water Bill")
    println("Transaction 2 Category: ${transaction2.categorizeTransaction()}")
}