package org.example

fun main() {
    //INSERT STATS HERE
    val heroStats = CharacterStats(hp = 100.0, def = 20.0) //defense should be around 0-30 for a fair game
    val enemyStats = CharacterStats(hp = 100.0, def = 25.0) //defense should be around 0-30 for a fair game

    val hero = Hero("Jason", heroStats)
    val enemy = Enemy("Enemy", enemyStats)

    val game = Game(hero, enemy)
    game.start()
}