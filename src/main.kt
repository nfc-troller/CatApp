fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flathead = Cat("Flathead", 10, 10)
    val cupra = Cat("Cupraia", 5, 5)

    binnie.walk()
    clyde.walk()
    println(binnie)
    println(clyde)
    flathead.eat()
    flathead.eat()
    println(flathead)
    cupra.walk()
    cupra.walk()
    cupra.walk()
    cupra.walk()
    println(cupra)
}