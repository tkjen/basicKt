package collectionFunctional

fun main() {

    //map() – Chuyển đổi từng phần tử
    //Dùng để biến đổi từng phần tử trong danh sách thành giá trị mới.
    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map { it * it }
    println(squaredNumbers) // [1, 4, 9, 16, 25]


    //filter() – Lọc dữ liệu
    // Dùng để lọc ra các phần tử thỏa mãn điều kiện.
    val numbers1 = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers1.filter { it % 2 == 0 }
    println(evenNumbers) // [2, 4]
    // =>> Lọc ra các số chia hết cho 2 → [2, 4]


    //reduce() – Gộp tất cả phần tử thành một giá trị duy nhất
    //  Dùng để tính toán trên toàn bộ danh sách và trả về một giá trị duy nhất.
    //Ví dụ: Tính tổng
    val numbers3 = listOf(1, 2, 3, 4, 5)
    val sum = numbers3.reduce { acc, num -> acc + num }
    println(sum) // 15
    // acc (accumulator) là tổng tích lũy, ban đầu bằng numbers[0] = 1
    //Mỗi lần lặp, acc cộng với num, cuối cùng trả về 15
    //Ví dụ: Tìm số lớn nhất
    val maxNumber = numbers.reduce { acc, num -> if (acc > num) acc else num }
    println(maxNumber) // => 5
    //Duyệt qua danh sách, giữ lại số lớn nhất.


    //flatMap() – Chuyển danh sách con thành danh sách phẳng
    //Dùng để biến mỗi phần tử thành một danh sách con, rồi gộp tất cả lại thành một danh sách duy nhất.

    //Ví dụ: Tách từ từ danh sách câu
    val sentences = listOf("Hello world", "Kotlin is fun")
    val words = sentences.flatMap { it.split(" ") }
    println(words) // => [Hello, world, Kotlin, is, fun]

//    "Hello world" → ["Hello", "world"]
//    "Kotlin is fun" → ["Kotlin", "is", "fun"]
//    flatMap gộp tất cả lại thành một danh sách duy nhất: [Hello, world, Kotlin, is, fun]





}

