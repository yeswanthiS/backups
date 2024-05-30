package LTransactions

data class Transaction(val amount: Double, val type: TransactionType)
enum class TransactionType {
    INCOME,
    EXPENSE
}
fun List<Transaction>.totalExpenses(): Double {
    return this.filter { it.type == TransactionType.EXPENSE }
        .sumByDouble { it.amount }
}
fun List<Transaction>.totalIncomes(): Double {
    return this.filter { it.type == TransactionType.INCOME }
        .sumByDouble { it.amount }
}
fun main() {
    val transactions = listOf(
        Transaction(100.0, TransactionType.INCOME),
        Transaction(50.0, TransactionType.EXPENSE),
        Transaction(200.0, TransactionType.INCOME),
        Transaction(75.0, TransactionType.EXPENSE)
    )
    println("Total Incomes: ${transactions.totalIncomes()}")
    println("Total Expenses: ${transactions.totalExpenses()}")
}