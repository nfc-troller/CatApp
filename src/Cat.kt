class Cat (val name: String, var age: Int, var weight: Int) {

    override fun toString() : String {
        return "Name: $name Age: $age"
    }
    public fun eat(): Boolean {
        if (weight < 20) {

            weight++
            return true
        }
        return false
    }
    public fun walk() : Boolean {
        if (weight > 5){
            weight--
            return true
        }
        return false

    }

}



