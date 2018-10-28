package utils.items

import builder.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import provider.HotbarItem

class ItemGadgets : HotbarItem {
    override fun build(): ItemStack {
        val itemBuilder = ItemBuilder(Material.CHEST)
        itemBuilder.setDisplayName("§eGadgets")
        return itemBuilder.build()
    }
}