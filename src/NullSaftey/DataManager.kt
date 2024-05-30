package NullSaftey

class DataManager<T> {
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }

    fun removeItem(item: T) {
        items.remove(item)
    }

    fun getAllItems(): List<T> {
        return items
    }

    fun getItemById(id: Int, getId: (T) -> Int?): T? {
        return items.find { getId(it) == id }
    }
}