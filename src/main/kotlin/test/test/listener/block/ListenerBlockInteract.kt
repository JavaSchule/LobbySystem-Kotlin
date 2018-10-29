package test.test.listener.block

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockPlaceEvent

class ListenerBlockInteract : Listener {

    @EventHandler
    fun onBuild(event: BlockPlaceEvent) {
        event.isCancelled = true
    }

    @EventHandler
    fun onBreak(event: BlockBreakEvent) {
        event.isCancelled = true
    }
}