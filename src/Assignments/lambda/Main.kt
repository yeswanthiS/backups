package Assignments.lambda

fun main() {
    val transactions = listOf(
        Transaction("T1", 100.0, "2024-05-14"),
        Transaction("T2", 150.0, "2024-05-15"),
        Transaction("T3", 75.0, "2024-05-16"),
        Transaction("T4", 200.0, "2024-05-13")
    )

    // Function to filter transactions based on a predicate
    fun filterTransactions(transactions: List<Transaction>, predicate: (Transaction) -> Boolean): List<Transaction> {
        return transactions.filter(predicate)
    }

    // Function to sort transactions based on a comparator
    fun sortTransactions(transactions: List<Transaction>, comparator: Comparator<Transaction>): List<Transaction> {
        return transactions.sortedWith(comparator)
    }

    // Filtering transactions by amount greater than 100
    val filteredByAmount = filterTransactions(transactions) { transaction -> transaction.amount > 100 }
    println("Transactions filtered by amount greater than 100: $filteredByAmount")

    // Sorting transactions by date
    val sortedByDate = sortTransactions(transactions) { transaction1, transaction2 ->
        transaction1.date.compareTo(transaction2.date)
    }
    println("Transactions sorted by date: $sortedByDate")

    // Sorting transactions by amount
    val sortedByAmount = sortTransactions(transactions) { transaction1, transaction2 ->
        transaction1.amount.compareTo(transaction2.amount)
    }
    println("Transactions sorted by amount: $sortedByAmount")
}