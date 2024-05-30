package Collections

fun processTransactions(transactions: List<Transaction>) {
    for (transaction in transactions) {
        println("Processing transaction: $transaction")
        // Add your processing logic here
    }
}

fun processTransactions(transactions: Set<Transaction>) {
    for (transaction in transactions) {
        println("Processing transaction: $transaction")
        // Add your processing logic here
    }
}

fun processTransactions(transactions: Map<Int, Transaction>) {
    for ((key, value) in transactions) {
        println("Processing transaction with ID $key: $value")
        // Add your processing logic here
    }
}