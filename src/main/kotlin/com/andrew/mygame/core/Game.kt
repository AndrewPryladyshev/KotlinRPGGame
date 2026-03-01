package com.andrew.mygame.core

import com.andrew.mygame.ui.ConsoleInterface

class Game(private val ui: ConsoleInterface) {

  val startMessage: String = "Game Started!"

  fun start() {
    ui.showMessage("$startMessage")
  }
}
