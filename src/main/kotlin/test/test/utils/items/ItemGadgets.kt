package test.test.utils.items

import test.test.builder.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import test.test.provider.HotbarItem

class ItemGadgets : HotbarItem {

    override fun build(): ItemStack {
        val itemBuilder = ItemBuilder(Material.CHEST)
        itemBuilder.setDisplayName("§eGadgets")
        return itemBuilder.build()
    }

    override fun getSlot(): Int {
        return 7
    }
}