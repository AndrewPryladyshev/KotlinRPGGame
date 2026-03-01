package com.andrew.mygame.ui

class ConsoleInterface() {

  fun showMessage(messsage: String) = println(messsage)

  fun getInput(): String? = readlnOrNull()
}
