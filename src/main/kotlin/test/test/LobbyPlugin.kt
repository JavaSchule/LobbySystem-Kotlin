package test.test

import test.test.listener.block.ListenerBlockInteract
import test.test.listener.entity.ListenerEntityConnection
import org.bukkit.plugin.java.JavaPlugin
import test.test.listener.entity.ListenerEntityDropItem
import test.test.listener.entity.ListenerEntityDamage
import test.test.listener.entity.ListenerEntityFoodLevel
import test.test.provider.HotbarItem
import test.test.utils.items.ItemCompass
import test.test.utils.items.ItemHidePlayer
import test.test.utils.items.ItemLobbyChanger

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
                ListenerEntityConnection(),
                ListenerEntityFoodLevel(),
                ListenerEntityDamage(),
                ListenerEntityDropItem(),
                ListenerEntityDamage()).forEach {
            server.pluginManager.registerEvents(it, this)
        }
    }

    private fun registerItems() {
        this.itemList.add(ItemCompass())
        this.itemList.add(ItemLobbyChanger())
        this.itemList.add(ItemHidePlayer())
    }
}