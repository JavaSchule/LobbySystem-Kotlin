package test.test.listener.entity

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerPickupArrowEvent
import org.bukkit.event.player.PlayerPickupItemEvent

class ListenerEntityPickupItem : Listener {


    @EventHandler
    fun onPickup(event: PlayerPickupItemEvent) {
        event.isCancelled = true
    }

    @EventHandler
    fun onPickup(event: PlayerPickupArrowEvent) {
        event.isCancelled = true
    }
}