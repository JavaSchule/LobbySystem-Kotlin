package test.test.listener.entity

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.event.entity.EntityDamageEvent

class ListenerEntityDamage : Listener {

    @EventHandler
    fun onEntityDamage(event: EntityDamageEvent) {
        event.isCancelled = true
    }

    @EventHandler
    fun onEntityDamage(event: EntityDamageByEntityEvent) {
        event.isCancelled = true
    }
}