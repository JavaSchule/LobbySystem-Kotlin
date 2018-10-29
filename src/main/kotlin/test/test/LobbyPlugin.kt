package test.test

import test.test.listener.block.ListenerBlockInteract
import test.test.listener.entity.ListenerEntityConnection
import org.bukkit.plugin.java.JavaPlugin
import test.test.provider.HotbarItem
import test.test.utils.items.ItemCompass
import test.test.utils.items.ItemGadgets

class LobbyPlugin : JavaPlugin() {

    companion object {
        lateinit var lobbyPlugin: LobbyPlugin
    }

    var itemList: ArrayList<HotbarItem> = ArrayList()

    override fun onEnable() {
        lobbyPlugin = this

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