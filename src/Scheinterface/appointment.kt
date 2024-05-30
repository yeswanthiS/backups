package Scheinterface

class appointment(private var time: String) : schedulable {
    override fun schedule(time: String): String {
        this.time = time
        return "Appointment scheduled at $time"
    }

    override fun reschedule(newTime: String): String {
        this.time = newTime
        return "Appointment rescheduled to $newTime"
    }

    override fun getType(): String {
        return "Appointment"
    }

    override fun getDate(): String {
        return time.split(" ")[0]  // Assuming the format is "YYYY-MM-DD HH:MM"
    }

    fun getTime(): String {
        return time
    }
}