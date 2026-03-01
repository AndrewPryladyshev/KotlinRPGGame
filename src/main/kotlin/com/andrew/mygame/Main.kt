package com.andrew.mygame

import com.andrew.mygame.core.Game
import com.andrew.mygame.ui.ConsoleInterface

fun main() {

  val ui = ConsoleInterface()
  val gameEngine = Game(ui)

  gameEngine.startMessage

  Thread.sleep(2500)
  println("Choose an item:\n")

  for (i in 1..5) {
    val randomNumber = (1..100).random()
    when (randomNumber) {
      in 0 ..< 50 -> {
        println("Common")
      }
      in 50 ..< 80 -> {
        println("Uncommon")
      }
      in 80 ..< 90 -> {
        println("Rare")
      }
      in 90 ..< 97 -> {
        println("Epic")
      }
      in 97..100 -> {
        println("Legendary")
      }
      else -> println("smthing went wrong")
    }
  }
}
