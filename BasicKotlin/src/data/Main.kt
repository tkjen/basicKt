package data

fun main() {
    //Data class
    //Data Class: Lưu trữ dữ liệu, tự động tạo phương thức hỗ trợ.
    val user1 = User("Peter", 28)
    val user2 = User("Peter", 28)

    // So sánh giá trị
    println(user1 == user2) // tra ra true
    //Tao ban sao
    val user3 = user1.copy(age = 30)
    println(user3)

    // Sử dụng componentN() để truy xuất dữ liệu
    val (name, age) = user1
    println("Tên: $name, Tuổi: $age") // Output: Tên: Thiện, Tuổi: 214

    //Enum: Danh sách giá trị cố định, không thể thay đổi.
    val today = DayOfWeek.SATURDAY

    if(today == DayOfWeek.SUNDAY) {
        println("Hôm nay là cuối tuần!")
    }
    // Lấy danh sách tất cả các giá trị Enum
    val days = DayOfWeek.values()
    println(days.joinToString()) // Output: MONDAY, TUESDAY, WEDNESDAY, ...

    val color = Color.RED
    color.printColor()
    val success = Result.Success("Tải dữ liệu thành công")
    handleResult(success) // Output: Thành công: Tải dữ liệu thành công



}
//Sealed Class: Hạn chế phạm vi kế thừa, hữu ích cho trạng thái API hoặc UI.
fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Thành công: ${result.data}")
        is Result.Error -> println("Lỗi: ${result.data}")
        is Result.Loading -> println("Đang tải...")
    }
}
