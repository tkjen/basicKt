package opp

abstract class AnimalAC {
    abstract fun makeSound()// truu tuong class con bắt buộc override.
    fun sleep()
    {
        println("AnimalAC is sleeping") //Có thân → class con không bắt buộc override.
    }
}

class CatAC : AnimalAC() {
    override fun makeSound() {
        println("CatAC is making sound")
    }

}
