package test.test.utils.items

import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import test.test.builder.ItemBuilder
import test.test.provider.HotbarItem

class ItemHidePlayer : HotbarItem {
    override fun build(): ItemStack {
        val itemBuilder = ItemBuilder(Material.STICK)
        itemBuilder.setDisplayName("§bSpieler verstecken")
        return itemBuilder.build()
    }

    override fun getSlot(): Int {
        return 1
    }
}