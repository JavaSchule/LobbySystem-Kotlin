package builder

import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta

class ItemBuilder constructor(private val material: Material, private val amount: Int) {

    private var itemStack: ItemStack = ItemStack(this.material, this.amount)

    private lateinit var itemMeta: ItemMeta

    constructor(material: Material) : this(material, 1)

    init {
        this.itemMeta = this.itemStack.itemMeta
    }

    fun setLore(vararg lore: String): ItemBuilder {
        this.itemMeta.lore.clear()
        lore.forEach { this.itemMeta.lore.add(it) }
        return this
    }

    fun setDisplayName(displayName: String): ItemBuilder {
        this.itemMeta.displayName = displayName
        return this
    }

    fun setSubId(subId: Short): ItemBuilder {
        this.itemStack.durability = subId
        return this
    }

    fun build(): ItemStack {
        this.itemStack.itemMeta = this.itemMeta
        return this.itemStack
    }

}