package opp.BT2

abstract class Sach(
   private var _maSach:String,
   var tenSach:String,
   var tacGia:String,
   var soTrang:Int,
    private var _giaBan: Double
) {

    init {
        require(_giaBan > 10_000) { "Giá bán phải lớn hơn 10,000 VNĐ" }
    }

    //Property theo de bai
    var maSach:String
    get() = _maSach
    set(value) {
        _maSach = value
    }

    var giaBan: Double
    get() = _giaBan
    set(value) {
       require(value>10_000)
       { "Gia Ban must be greater than 10000" }
        _giaBan = value
    }

    companion object{
        const val TI_LE_THUE = 0.03
    }

    // Constructor mặc định
    constructor() : this(
        "S001",
        "Hướng đối tượng",
        "Nguyễn Cửu Đàm",
        100,
        40_000.0
    )

    fun xuatThongTin() {
        println("Mã sách: $maSach")
        println("Tên sách: $tenSach")
        println("Tác giả: $tacGia")
        println("Số trang: $soTrang")
        println("Giá bán: $giaBan VNĐ")
    }


    // Tính lợi nhuận
    fun tinhLoiNhuan(chiPhi: Double): Double {
        return giaBan - chiPhi - thueSanXuat() - tienNhuanBut()
    }

    // Tính thuế sản xuất
    fun thueSanXuat(): Double {
        return giaBan * TI_LE_THUE
    }

    // Tính tiền nhuận bút
    fun tienNhuanBut(): Double {
        return giaBan * 0.2
    }



}