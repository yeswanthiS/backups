package Scheinterface

class meeting(private var time: String) : schedulable {
    override fun schedule(time: String): String {
        this.time = time
        return "Meeting scheduled at $time"
    }

    override fun reschedule(newTime: String): String {
        this.time = newTime
        return "Meeting rescheduled to $newTime"
    }

    override fun getType(): String {
        return "Meeting"
    }

    override fun getDate(): String {
        return time.split(" ")[0]  // Assuming the format is "YYYY-MM-DD HH:MM"
    }

    fun getTime(): String {
        return time
    }
}