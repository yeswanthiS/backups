package SpecialEvents

// Define the SpecialEvent subclass with additional features
class SpecialEvent(id: Int, name: String, description: String) : Event(id, name, description) {
    val vipList = mutableListOf<String>()
    val premiumServices = mutableListOf<String>()

    // Method to add a VIP
    fun addVip(vip: String) {
        vipList.add(vip)
        println("VIP added: $vip")
    }

    // Method to remove a VIP
    fun removeVip(vip: String): Boolean {
        if (vipList.remove(vip)) {
            println("VIP removed: $vip")
            return true
        }
        println("VIP not found: $vip")
        return false
    }

    // Method to add a premium service
    fun addPremiumService(service: String) {
        premiumServices.add(service)
        println("Premium service added: $service")
    }

    // Method to remove a premium service
    fun removePremiumService(service: String): Boolean {
        if (premiumServices.remove(service)) {
            println("Premium service removed: $service")
            return true
        }
        println("Premium service not found: $service")
        return false
    }
}