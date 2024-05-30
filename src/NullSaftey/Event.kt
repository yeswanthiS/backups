package NullSaftey

data class Event(val id: Int, val name: String, val date: String?, var tags: MutableList<String> = mutableListOf(), var category: String? = null)