package utils

import org.bukkit.entity.Player
import  LobbyPlugin;

class User constructor(val user: Player) {

    val lobbyPlugin: LobbyPlugin = LobbyPlugin()

    fun setHotbar() {
        for (i in 0..lobbyPlugin.itemList.size) {
            user.inventory.setItem(i, lobbyPlugin.itemList.get(i).build())
        }
    }
}