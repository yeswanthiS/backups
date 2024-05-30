// Custom exception for insufficient balance error
class InsufficientBalanceException(message: String) : Exception(message)
// Custom exception for invalid transaction type error
class InvalidTransactionTypeException(message: String) : Exception(message)
// Custom exception for invalid transaction amount error
class InvalidTransactionAmountException(message: String) : Exception(message)
fun processTransaction(transactionType: String, amount: Double, balance: Double) {
    try {
        if (amount <= 0) {
            throw InvalidTransactionAmountException("Transaction amount must be greater than zero.")
        }
        if (transactionType !in listOf("deposit", "withdraw")) {
            throw InvalidTransactionTypeException("Invalid transaction type.")
        }
        if (transactionType == "withdraw" && amount > balance) {
            throw InsufficientBalanceException("Insufficient balance for the transaction.")
        }
// Process the transaction
// ...
    } catch (e: InsufficientBalanceException) {
        println("Error: ${e.message}")
    } catch (e: InvalidTransactionTypeException) {
        println("Error: ${e.message}")
    } catch (e: InvalidTransactionAmountException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println("An unexpected error occurred: ${e.message}")
    }
}
fun main() {
    val balance = 1000.0
    val transactionType = "withdraw"
    val amount = 1500.0
    processTransaction(transactionType, amount, balance)
}