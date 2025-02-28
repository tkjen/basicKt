package opp.example

interface Animal {
    fun makeSound() // là phương thức trừu tượng, bắt buộc phải override

    fun sleep() {
        println("Sleeping...")
    } // Hàm có thân (default function) có thân => class kế thừa có thể sử dụng ngay mà không cần override.
}

class Dog : Animal {
    override fun makeSound() {
        println("Dog is sound")
    }
}
class Cat : Animal {
    override fun makeSound() {
        println("Cat is sound")
    }
}