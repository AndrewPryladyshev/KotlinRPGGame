package com.andrew.mygame.model

class Inventory {
  private val items = mutableListOf<Item>()

  fun addItem(item: Item) {
    if (items.size <= 50) {

      items.add(item)
    }
  }

  fun deleteItem(itemName: String) {
    val currentItem = items.find { it.name == itemName }
    items.remove(currentItem)
  }

  fun upgradeItem() {
    // TODO: REALISE ITEM UPGRADING
  }
}
