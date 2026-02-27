// Characters

val player = Character(
    100, 0, 0, 5, 0, 0, "Player", 1f,
)


val goblin = Character(
    75, 0, 0, 4, 0, 0, "Default Enemy", 1f,
)

val bigGoblin = Character(
    300, 40, 5, 30, 10, 5,  "Elite Enemy", 1f,
)

val goblinKing = Character(
    750, 100, 10, 70, 30, 30, "Boss", 1f,
)

// Items

val basicSword = Item(
    "Basic Sword",
    "Sword",
    0,
    0,
    0,
    10,
    0,
    0,
    "Common"
)

val basicHelmet = Item(
    "Basic Helmet",
    "Helmet",
    20,
    1,
    2,
    0,
    0,
    0,
    "Common"
)

val diamondChestplate = Item(
    "Diamond Chestplate",
    "Chestplate",
    30,
    5,
    5,
    2,
    3,
    1,
    "Rare"
)

val barhatnyeTyagi = Item(
    "Barhatnye Tyagi",
    "Boots",
    75,
    5,
    10,
    10,
    10,
    10,
    "Mystical",
)

val anubisHat = Item(
    "Anubis Hat",
    "Helmet",
    90,
    50,
    5,
    5,
    30,
    35,
    "Legendary"
)
