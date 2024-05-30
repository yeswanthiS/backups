package Assignments.Inheritence

class Income(id: Int, amount: Double, description: String, date: String) :
    Transaction(id, amount, description, date) {
    override fun toString(): String {
        return "Income(ID: $id, Amount: $amount, Description: $description, Date: $date)"
    }
}