package Scheinterface

interface schedulable {
    fun schedule(time: String): String
    fun reschedule(newTime: String): String
    fun getType(): String
    fun getDate(): String
}