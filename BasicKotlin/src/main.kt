import java.sql.Connection
import java.sql.DriverManager


fun main()
{
    val url = "jdbc:sqlite:tasks.db"

    try {
        val connection: Connection = DriverManager.getConnection(url)
        println("Kết nối SQLite thành công!")
        connection.close()
    } catch (e: Exception) {
        println("Lỗi kết nối: ${e.message}")
    }
}