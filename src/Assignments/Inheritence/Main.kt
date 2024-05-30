package Assignments.Inheritence

fun  main() {
    // Creating income and expense transactions
    val incomeTransaction = Income(1, 1000.0, "Salary", "2024-05-15")
    val expenseTransaction = Expense(2, 50.0, "Groceries", "2024-05-16")

    // Printing transactions
    println(incomeTransaction)
    println(expenseTransaction)
}