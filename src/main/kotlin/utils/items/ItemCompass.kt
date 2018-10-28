package utils.items

import builder.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import provider.HotbarItem

class ItemCompass : HotbarItem {
    override fun build(): ItemStack? {
        val itemBuilder: ItemBuilder = ItemBuilder(Material.COMPASS)
        itemBuilder.setDisplayName("§aCompass")
        return itemBuilder.build()
    }
}