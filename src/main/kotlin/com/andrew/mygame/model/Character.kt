package com.andrew.mygame.model

class Character(
        val hp: Int,
        val mana: Int,
        val resistance: Int,
        val damage: Int,
        val magResistance: Int,
        val magDamage: Int,
        var type: String?,
        var attackSpeed: Float,
        var spells: MutableList<Spell>,
        var weapon: Item,
      
) {
  fun physical_attack(): Int {
    // smthing that will be returned
    var physicalDamage = null
    return 0
  }

  fun block() {}

  fun death() {}

  fun magical_attack(): Int {
    return 0
  }
}
