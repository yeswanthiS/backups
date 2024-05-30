package Exportables

interface exportable {
    fun exportToCSV(filePath: String, transactions: List<transaction>): Boolean
}