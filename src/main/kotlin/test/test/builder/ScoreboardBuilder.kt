package test.test.builder

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.scoreboard.DisplaySlot
import org.bukkit.scoreboard.Objective
import org.bukkit.scoreboard.Scoreboard

class ScoreboardBuilder constructor(val displayName: String) {

    val scoreboard: Scoreboard = Bukkit.getScoreboardManager().newScoreboard
    val objective: Objective = scoreboard.registerNewObjective("lobby", "dummy")
    val scoreSize: Int = 0


    fun setScore(text: String): ScoreboardBuilder {
        scoreSize?.plus(1)
        objective.getScore(text).score = scoreSize
        return this
    }
    fun setBlank(){
        setScore(" ")
    }
    fun build(player: Player) {
        objective.displaySlot = DisplaySlot.SIDEBAR
        objective.displayName = this.displayName
        player.scoreboard = this.scoreboard
    }

}