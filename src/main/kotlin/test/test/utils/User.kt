package test.test.utils

import org.bukkit.entity.Player
import  test.test.LobbyPlugin;
import java.util.*

class User constructor(val user: Player) {

    private val lobbyPlugin = LobbyPlugin.lobbyPlugin

    fun setHotbar() {
        for (i in 0..lobbyPlugin.itemList.size) {
            user.inventory.setItem(lobbyPlugin.itemList[i].getSlot(), lobbyPlugin.itemList[i].build())
        }
    }

    fun clearContents() {
        this.user.inventory.armorContents = null
        this.user.foodLevel = 20
    }

    fun setDefaultParameter() {
        val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
        this.user.level = currentYear
    }
}