package test.test.listener.entity

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerKickEvent
import org.bukkit.event.player.PlayerQuitEvent
import test.test.utils.User

class ListenerEntityConnection : Listener {

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        event.joinMessage = null
        val player = event.player
        player.inventory.clear()
        val user = User(player)
        user.clearContents()
        user.setHotbar()
        user.setDefaultParameter()
    }

    @EventHandler
    fun onQuit(event: PlayerQuitEvent) {
        val player = event.player
        event.quitMessage = null
    }

    @EventHandler
    fun onKick(event: PlayerKickEvent) {
        val player = event.player
        event.leaveMessage = null
    }
}