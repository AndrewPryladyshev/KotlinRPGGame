class Character(
    val hp: Int,
    val mana: Int,
    val resistance: Int,
    val damage: Int,
    val magResistance: Int,
    val magDamage: Int,
    var type: String?,
    var attackSpeed: Float,
    var spells: MutableList,
    var weapon: 
) {
  fun physical_attack(): Int {
    // smthing that will be returned
    var physical_damage
  }

  fun block() {

  }

  fun death() {
    
  }

  fun magical_attack() : Int {

  }
}
