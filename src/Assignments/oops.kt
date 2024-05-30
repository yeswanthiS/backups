package Assignments

class Transaction(val id: Int, var amount: Double, var description: String)

class TransactionList {
    private val transactions = mutableListOf<Transaction>()
    private var nextId = 1

    fun addTransaction(amount: Double, description: String) {
        transactions.add(Transaction(nextId++, amount, description))
    }

    fun deleteTransaction(id: Int): Boolean {
        val transactionIndex = transactions.indexOfFirst { it.id == id }
        if (transactionIndex != -1) {
            transactions.removeAt(transactionIndex)
            return true
        }
        return false
    }

    fun editTransaction(id: Int, newAmount: Double, newDescription: String): Boolean {
        val transaction = transactions.find { it.id == id }
        if (transaction != null) {
            transaction.amount = newAmount
            transaction.description = newDescription
            return true
        }
        return false
    }

    fun printTransactions() {
        if (transactions.isEmpty()) {
            println("No transactions.")
        } else {
            println("Transactions:")
            transactions.forEach { println("ID: ${it.id}, Amount: ${it.amount}, Description: ${it.description}") }
        }
    }
}

fun main() {
    val transactionList = TransactionList()

    transactionList.addTransaction(100.0, "Groceries")
    transactionList.addTransaction(50.0, "Dinner")

    transactionList.printTransactions()


    println("Editing transaction with ID 1")
    transactionList.editTransaction(1, 120.0, "Monthly groceries")


    transactionList.printTransactions()


    println("Deleting transaction with ID 2")
    transactionList.deleteTransaction(2)

    transactionList.printTransactions()
}