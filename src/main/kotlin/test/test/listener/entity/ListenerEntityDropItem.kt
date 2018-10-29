package test.test.listener.entity

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerDropItemEvent

class ListenerEntityDropItem : Listener {

    @EventHandler
    fun onDrop(event: PlayerDropItemEvent) {
        event.isCancelled = true
    }

}