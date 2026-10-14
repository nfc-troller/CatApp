fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flathead = Cat("Flathead", 7, 22)
    val cupra = Cat("Cupraia", 2, 7)

    binnie.walk()
    clyde.walk()
    println(binnie)
    println(clyde)
    println(if (flathead.eat() == true) "Successfully ate food" else "Failed to eat food")
    flathead.eat()
    println(flathead)
    cupra.walk()
    cupra.walk()
    cupra.walk()
    cupra.walk()
    println(cupra)
}