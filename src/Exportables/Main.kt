package Exportables

fun main() {
    val transactions = listOf(
        transaction(1, "2024-05-01", 100.0, "Payment received"),
        transaction(2, "2024-05-02", -50.0, "Purchase"),
        transaction(3, "2024-05-03", 200.0, "Salary")
    )

    val exporter = CSVexporter()
    val success = exporter.exportToCSV("transactions.csv", transactions)

    if (success) {
        println("Transactions exported successfully to transactions.csv")
    } else {
        println("Failed to export transactions")
    }
}