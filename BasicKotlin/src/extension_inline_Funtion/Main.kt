package extension_inline_Funtion

fun main() {

    //Sử dụng Extension Function
    val name = "Thiện"
    println(name.reverse()) // Output: nệihT

    inlineFunction { println("Hàm Lambda được gọi!") }

}
//Extension Function giúp thêm phương thức vào một class mà không cần sửa đổi mã nguồn của class đó.
fun String.reverse(): String {
    return this.reversed() // `this` là String hiện tại
}
//String.reverse(): Thêm một hàm mới reverse() vào class String.
//this là đối tượng String mà hàm này đang được gọi.
//Dùng khi nào?
//Khi cần mở rộng chức năng của một class mà không thể chỉnh sửa class đó (ví dụ: các class của thư viện).


//Inline Function – Hàm nội tuyến
//Ví dụ không có inline (gọi hàm bình thường)
fun normalFunction(action: () -> Unit) {
    println("Trước khi gọi action()")
    action()
    println("Sau khi gọi action()") //normalFunction() gọi action(), tạo một stack frame mới.
}
//Dùng Inline Function

inline fun inlineFunction(action: () -> Unit) {
    println("Trước khi gọi action()")
    action()
    println("Sau khi gọi action()")
}
//Dùng khi nào?

//Khi hàm có lambda function để tránh tạo object lambda và stack frame mới.
//Khi muốn tối ưu hiệu suất bằng cách giảm overhead.


