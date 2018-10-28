package listener.block

import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockPlaceEvent

class ListenerBlockInteract : Listener {

    fun onBuild(event: BlockPlaceEvent) {
        event.isCancelled = true
    }

    fun onBreak(event: BlockBreakEvent) {
        event.isCancelled = true
    }
}