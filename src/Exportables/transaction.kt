package Exportables

data class transaction(
    val id: Int,
    val date: String,
    val amount: Double,
    val description: String
)