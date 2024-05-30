package Encapsulation

fun main() {
    val transaction = transaction()

    // Using setter methods to modify properties
    transaction.setTransactionId("12345")
    transaction.setAmount(250.0)
    transaction.setDescription("Payment for services")

    // Using getter methods to access properties
    println(transaction.getTransactionId()) // Outputs: 12345
    println(transaction.getAmount()) // Outputs: 250.0
    println(transaction.getDescription()) // Outputs: Payment for services

    // Trying to access sensitive data directly
    println(transaction.getSensitiveData()) // Outputs: Access Denied

    // Using a method to update sensitive data
    transaction.updateSensitiveData("SensitiveInfo123")

    // Trying to access sensitive data again
    println(transaction.getSensitiveData()) // Still outputs: Access Denied

    // Clearing sensitive data
    transaction.clearSensitiveData()
}