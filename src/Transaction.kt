data class Transaction(val amount: Double)
fun main() {
// Simulating the scenario where transaction data is absent
    val transaction: Transaction? = null
// Using safe calls and Elvis operator to handle nullability
    val transactionAmount = transaction?.amount ?: 0.0
    println("Transaction amount: $transactionAmount")
}