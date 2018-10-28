import org.bukkit.plugin.java.JavaPlugin
import provider.HotbarItem
import utils.items.ItemCompass
import utils.items.ItemGadgets

class LobbyPlugin : JavaPlugin() {

     val itemList: ArrayList<HotbarItem> = ArrayList()

    override fun onEnable() {
        this.registerListener()
        this.registerItems()
    }

    override fun onDisable() {

    }

    private fun registerListener() {

    }

    private fun registerItems() {
        itemList.add(ItemCompass())
        itemList.add(ItemGadgets())
    }
}