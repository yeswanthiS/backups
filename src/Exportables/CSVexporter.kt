package Exportables

import java.io.File
import java.io.FileWriter
import java.io.IOException

class CSVexporter : exportable {
    override fun exportToCSV(filePath: String, transactions: List<transaction>): Boolean {
        val file = File(filePath)
        try {
            FileWriter(file).use { writer ->
                writer.append("ID,Date,Amount,Description\n")
                for (transaction in transactions) {
                    writer.append("${transaction.id},${transaction.date},${transaction.amount},${transaction.description}\n")
                }
            }
            return true
        } catch (e: IOException) {
            e.printStackTrace()
            return false
        }
    }
}