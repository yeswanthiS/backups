package DataManaging

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
}