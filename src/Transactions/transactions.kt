package Transactions

import java.util.Date

class Transaction(
    val amount: Double,
    val date: Date,
    val category: String
) {
    fun categorizeTransaction(): String {
        return when {
            amount <= 0 -> "Invalid Transaction"
            amount <= 50 -> "Food"
            amount <= 100 -> "Utilities"
            amount <= 200 -> "Entertainment"
            else -> "Other"
        }
    }

    override fun toString(): String {
        return "Transaction(amount=$amount, date=$date, category='$category')"
    }
}