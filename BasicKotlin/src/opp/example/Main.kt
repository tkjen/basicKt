package opp.example

fun main() {
    val person1 = Person("Peter", 28)
    person1.getPerson()

    Database.connect()
//ve interface
    val dog = Dog()
    dog.makeSound()
    dog.sleep()
//🚀 Nếu một class cần chia sẻ "hành vi chung" nhưng không có chung nguồn gốc → Dùng Interface.
//🚀 Nếu các class có mối quan hệ chặt chẽ và cần chung trạng thái → Dùng Abstract Class.
//abstract class
  val cat = CatAC()
    cat.sleep()





}