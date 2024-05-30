package Collections

fun main() {
    val transactionList = listOf(
        Transaction(1, "2024-05-01", 100.0, "Payment received"),
        Transaction(2, "2024-05-02", -50.0, "Purchase"),
        Transaction(3, "2024-05-03", 200.0, "Salary")
    )

    val transactionSet = setOf(
        Transaction(4, "2024-05-04", 150.0, "Expense"),
        Transaction(5, "2024-05-05", -75.0, "Refund")
    )

    val transactionMap = mapOf(
        6 to Transaction(6, "2024-05-06", 300.0, "Investment"),
        7 to Transaction(7, "2024-05-07", -25.0, "Withdrawal")
    )

    processTransactions(transactionList)
    processTransactions(transactionSet)
    processTransactions(transactionMap)
}