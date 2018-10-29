package test.test.provider

import org.bukkit.inventory.ItemStack

interface HotbarItem {

    abstract fun build(): ItemStack

    fun getSlot(): Int {
        return 0
    }

}