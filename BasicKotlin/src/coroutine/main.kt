package coroutine

fun main()
{
   // GlobalScope.launch {
      //  println("Bắt đầu tải dữ liệu...")
       // fetchData()
     //   println("Dữ liệu đã tải xong")
   // }

}

//suspend function – Hàm có thể tạm dừng
//✔ Hàm suspend có thể tạm dừng và tiếp tục thực thi mà không chặn luồng chính.
//✔ Chỉ có thể được gọi trong coroutine hoặc một hàm suspend khác.
suspend fun fetchData(): String {
    //delay(2000) // Tạm dừng trong 2 giây mà không chặn luồng chính
    return "Dữ liệu đã tải xong"
}
//delay(2000) không chặn luồng chính, mà chỉ tạm dừng coroutine trong 2 giây.
//Hàm fetchData() phải được gọi trong một coroutine.


// *LAUNCH* – Chạy Coroutine mà không cần kết quả
//✔ Dùng khi bạn chỉ muốn chạy một tác vụ nhưng không cần lấy kết quả.
//✔ Không chặn chương trình (fire-and-forget).

//GlobalScope.launch {
//    println("Bắt đầu tải dữ liệu...")
//    fetchData()
//    println("Dữ liệu đã tải xong")
//}


//async – Chạy Coroutine và lấy kết quả (Deferred)
//✔ Dùng khi bạn cần lấy kết quả từ coroutine.
//✔ Nó trả về một Deferred<T>, có thể gọi await() để lấy kết quả.

//val deferredData: Deferred<String> = GlobalScope.async {
//    fetchData()
//}
//val result = deferredData.await() // Chờ kết quả từ coroutine
//println(result) // In ra: Dữ liệu đã tải xong


//await – Chờ kết quả từ async
//✔ Chỉ dùng với async để lấy giá trị khi coroutine hoàn thành.
//Ví dụ: Tải dữ liệu song song
//val data1 = async { fetchData() }
//val data2 = async { fetchData() }
//println("Kết quả 1: ${data1.await()}")
//println("Kết quả 2: ${data2.await()}")
//Hai coroutine chạy song song giúp tiết kiệm thời gian.
//await() chỉ chờ khi dữ liệu sẵn sàng.

//Cơ chế	Mô tả	                                                Ứng dụng
//suspend	Hàm có thể tạm dừng mà không chặn luồng chính	Gọi API, đọc dữ liệu từ database
//launch	Chạy coroutine mà không cần kết quả	            Lưu dữ liệu, ghi log
//async	    Chạy coroutine và lấy kết quả	                Gọi API song song, tính toán dữ liệu
//await	    Chờ kết quả từ async	                        Hiển thị dữ liệu sau khi tải xong







