package test.test.utils

import org.bukkit.entity.Player
import  test.test.LobbyPlugin;
import java.lang.Exception
import java.util.*

class User constructor(val user: Player) {

    private val lobbyPlugin = LobbyPlugin.lobbyPlugin

    fun setHotbar() {
        for (i in 0..lobbyPlugin.itemList.size) {
            try {
                user.inventory.setItem(lobbyPlugin.itemList[i].getSlot(), lobbyPlugin.itemList[i].build())
            } catch (exception: Exception) {
                exception.stackTrace
            }
        }
    }

    fun clearContents() {
        this.user.inventory.armorContents = null
        this.user.foodLevel = 20
        this.user.health = 20.0
    }

    fun setDefaultParameter() {
        val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
        this.user.level = currentYear
    }
}