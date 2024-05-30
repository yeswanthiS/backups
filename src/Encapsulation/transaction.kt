package Encapsulation

class transaction {
    // Private fields to restrict direct access
    private var transactionId: String = ""
    private var amount: Double = 0.0
    private var description: String = ""
    private var sensitiveData: String = ""

    // Public getter for transactionId
    fun getTransactionId(): String {
        return transactionId
    }

    // Public setter for transactionId
    fun setTransactionId(value: String) {
        // Additional logic or validation can be added here
        transactionId = value
    }

    // Public getter for amount
    fun getAmount(): Double {
        return amount
    }

    // Public setter for amount
    fun setAmount(value: Double) {
        // Additional logic or validation can be added here
        if (value >= 0) {
            amount = value
        } else {
            throw IllegalArgumentException("Amount must be non-negative")
        }
    }

    // Public getter for description
    fun getDescription(): String {
        return description
    }

    // Public setter for description
    fun setDescription(value: String) {
        // Additional logic or validation can be added here
        description = value
    }

    // Public method to get sensitive data with restricted access
    fun getSensitiveData(): String {
        return "Access Denied" // Prevents direct access to sensitive data
    }

    // Private method to set sensitive data
    private fun setSensitiveData(value: String) {
        // Only internal methods or authorized classes can modify sensitive data
        sensitiveData = value
    }

    // Public method to update sensitive data securely
    fun updateSensitiveData(newData: String) {
        // Additional security checks can be added here
        setSensitiveData(newData)
    }

    // Public method to clear sensitive data securely
    fun clearSensitiveData() {
        setSensitiveData("")
    }
}