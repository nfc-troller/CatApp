class Cat (val name: String, var age: Int, var weight: Int) {

    override fun toString() : String {
        return "Name: $name Age: $age"
    }
    fun eat(): Boolean {
        weight --
        return true

    }
    public fun walk() : Boolean {
        if (weight > 5){
            weight--
            return true
        }
        return false

    }

}



