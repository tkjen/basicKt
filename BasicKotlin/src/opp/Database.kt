package opp


//Singleton Object (Đối tượng duy nhất)
object Database {
    val name = "Peter"
    fun connect(){
        println("Connecting... to ${name}")
    }
}
