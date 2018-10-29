package test.test.listener.entity

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.FoodLevelChangeEvent

class ListenerEntityFoodLevel : Listener {


    @EventHandler
    fun onFoodLevelChange(event: FoodLevelChangeEvent) {
        event.isCancelled = true
    }

}