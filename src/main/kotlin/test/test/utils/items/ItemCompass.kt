package test.test.utils.items

import test.test.builder.ItemBuilder
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import test.test.provider.HotbarItem

class ItemCompass : HotbarItem {

    override fun build(): ItemStack {
        val itemBuilder: ItemBuilder = ItemBuilder(Material.COMPASS)
        itemBuilder.setDisplayName("§aCompass")
        return itemBuilder.build()
    }

    override fun getSlot(): Int {
        return 4
    }
}
