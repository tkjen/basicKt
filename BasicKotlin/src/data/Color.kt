package data

enum class Color(val hex: String) {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    fun printColor() {
        println("Mã màu của $name là $hex")
    }
}