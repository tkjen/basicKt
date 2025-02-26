package basic



fun main()
{

    //Bien va Kieu Du Lieu
    val age:Int = 30 // khai bao bien val la kieu khong the thay doi sau khi gan
    var name:String = "Alice " // khai bao bien var co the thay doi
    name = "Thien"


    val numbers:List<Int> = listOf(1,2,3,4,5)// List bat bien
    val mutableList:MutableList<Int> = mutableListOf(1,2,3,4,5) // List co the thay doi


    val person:Map<String,Any> = mapOf("name" to name,"age" to 40) //Tạo một Map bất biến, lưu các cặp key-value.


    //Câu điều kiện (if, when), vòng lặp (for, while):

    var x = 10
    if(x > 10)
        println("x is greater than 10")
    else if (x < 0)
        println("x is less than 0")
    else
        println("x is greater than or equal to 0")


    //Tương tự switch case trong các ngôn ngữ khác, mạnh mẽ và linh hoạt hơn
    when(x){
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> println("x is not 1 or 2 ")
    }

    for(number in numbers){
        println(number)
    }

    var i = 5 ;
    while(i < 5)
    {
        println(i)
        i++
    }





}
//***************************************************************************************//
//Hàm (fun, lambda, higher-order function):

fun sum(a:Int, b:Int):Int{
    return a+b
}
//Single-expression function
fun sum1(a:Int, b:Int):Int = a+b

//***************************************************************************************//

//Lambda Function (Hàm ẩn danh)
//Lambda là một hàm không có tên (anonymous function), có thể gán vào biến hoặc truyền làm tham số.

val add: (Int, Int) -> Int = { a, b -> a + b }
val result = add(5, 10)
 // in ra
//println(result) // Output: 15


//Lambda không tham số
val greet: () -> String = { "Hello, Kotlin!" }
// println(greet())  Output: Hello, Kotlin!


//Lambda với một tham số (it)
//Nếu lambda có một tham số, ta có thể dùng it thay vì đặt tên:
val square: (Int) -> Int = { it * it }
//println(square(4)) // Output: 16


//***************************************************************************************//

//Higher-Order Function (Hàm bậc cao)

//Hàm bậc cao là hàm nhận một hàm khác làm tham số hoặc trả về một hàm.

fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
//Hàm operateOnNumbers nhận hai số a, b và một hàm lambda operation để xử lý chúng.
//Gọi hàm với lambda

val sumResult = operateOnNumbers(5, 3) { x, y -> x + y }
val mulResult = operateOnNumbers(5, 3) { x, y -> x * y }

//println(sumResult) // Output: 8
//println(mulResult) // Output: 15

//Ví dụ: Hàm trả về một lambda
fun getMultiplier(factor: Int): (Int) -> Int {
    return { num -> num * factor }
}

val double = getMultiplier(2)
//println(double(10)) // Output: 20


//***************************************************************************************//






