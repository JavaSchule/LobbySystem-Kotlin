import listener.block.ListenerBlockInteract
import listener.entity.ListenerEntityConnection
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import provider.HotbarItem
import utils.items.ItemCompass
import utils.items.ItemGadgets

class LobbyPlugin : JavaPlugin() {
    var itemList: ArrayList<HotbarItem> = ArrayList()

    override fun onEnable() {
        this.registerListener()
        this.registerItems()
    }

    override fun onDisable() {

    }

    private fun registerListener() {
        arrayOf(ListenerBlockInteract(),
                ListenerEntityConnection()).forEach {
            server.pluginManager.registerEvents(it, this)
        }
    }

    private fun registerItems() {
        this.itemList.add(ItemCompass())
        this.itemList.add(ItemGadgets())
    }
}