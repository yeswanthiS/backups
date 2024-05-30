package NullSaftey

fun Event.addTag(tag: String) {
    if (!tags.contains(tag)) {
        tags.add(tag)
    }
}

fun Event.removeTag(tag: String) {
    tags.remove(tag)
}

fun Event.setCategory(category: String) {
    this.category = category
}

fun Event.clearCategory() {
    this.category = null
}