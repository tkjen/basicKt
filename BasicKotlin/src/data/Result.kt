package data

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val data: String) : Result()
    object Loading : Result()
}
//Sealed Class là một class trừu tượng chỉ cho phép các class con được định nghĩa trong cùng một file.
//Success, Error, Loading là các class con của Result.