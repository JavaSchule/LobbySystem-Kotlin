package listener.entity

import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerKickEvent
import org.bukkit.event.player.PlayerQuitEvent
import utils.User

class ListenerEntityConnection : Listener {

    fun onJoin(event: PlayerJoinEvent) {
        event.joinMessage = null
        val player = event.player
        val user = User(player)
        user.setHotbar()
    }

    fun onQuit(event: PlayerQuitEvent) {
        val player = event.player
        event.quitMessage = null
    }

    fun onKick(event: PlayerKickEvent) {
        val player = event.player
        event.leaveMessage = null
    }
}