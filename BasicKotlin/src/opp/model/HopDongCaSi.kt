package opp.model

abstract class HopDongCaSi(
    // Constructor chính (primary constructor) với các tham số và giá trị mặc định
    maHopDong: String,
    tenCaSi: String,
    soTietMuc: Int = 2, // Giá trị mặc định
    ngayBieuDien: String = "24/12/2020", // Giá trị mặc định
    donGia: Int,
    phuPhi: Int = 0 // Giá trị mặc định
) {
    // Các thuộc tính được khai báo và có thể gán giá trị trực tiếp
    private var maHopDong: String
    var tenCaSi: String
    var soTietMuc: Int
    var ngayBieuDien: String
    private var donGia: Int
    var phuPhi: Int

    companion object {
        const val TAX_RATE = 0.15 // ti le thue chung
    }

    // Khối init (chạy khi constructor chính được gọi)
    init {
        require(maHopDong.matches(Regex("^HD\\d{4}$"))) {
            "⚠️ Mã hợp đồng không hợp lệ! Phải có 6 ký tự, bắt đầu bằng 'HD' và 4 số."
        }
        require(donGia > 0) { "⚠️ Đơn giá phải là một số dương!" }

        this.maHopDong = maHopDong
        this.tenCaSi = tenCaSi
        this.soTietMuc = soTietMuc
        this.ngayBieuDien = ngayBieuDien
        this.donGia = donGia
        this.phuPhi = phuPhi
    }

    // Constructor với 3 tham số (gọi constructor chính)
    constructor(maHopDong: String, tenCaSi: String, donGia: Int) : this(maHopDong, tenCaSi, 2, "24/12/2020", donGia, 0)

    // Constructor mặc định (không tham số) (gọi constructor chính)
    constructor() : this("HD3418", "Lý Không Hay", 3, "24/10/2020", 4000000, 2000000)

    // Phương thức trừu tượng
    abstract fun tinhPhiQuangCao(): Int

    fun tinhThanhTien(): Int {
        return donGia * soTietMuc + phuPhi + tinhPhiQuangCao()
    }

    fun tinhThue(): Double {
        return tinhThanhTien() * TAX_RATE
    }

    // Getter cho mã hợp đồng
    fun getMaHopDong(): String {
        return maHopDong
    }

    // Setter cho mã hợp đồng
    fun setMaHopDong(maHD: String) {
        require(maHD.matches(Regex("^HD\\d{4}$"))) {
            "⚠️ Mã hợp đồng không hợp lệ! Phải có 6 ký tự, bắt đầu bằng 'HD' và 4 số."
        }
        this.maHopDong = maHD

    }

    // Getter cho đơn giá
    fun getDonGia(): Int {
        return donGia
    }

    // Setter cho đơn giá
    fun setDonGia(gia: Int) {
        require(gia > 0) {"⚠️ Đơn giá phải là một số dương!" }
        this.donGia = gia
    }

    fun formatNumber(num: Int): String {
        return "%,d".format(num).replace(",", ".") // 1000000 → 1.000.000
    }

    // Phương thức hiển thị thông tin hợp đồng
    fun hienThiThongTin() {
        println("📜 Hợp đồng biểu diễn:")
        println("📌 Mã hợp đồng: $maHopDong")
        println("🎤 Tên ca sĩ: $tenCaSi")
        println("🎶 Số tiết mục: $soTietMuc")
        println("📅 Ngày biểu diễn: $ngayBieuDien")
        println("💰 Đơn giá: ${donGia.toString().replace(Regex("(\\d)(?=(\\d{3})+(?!\\d))"), "$1.")} VND")
        println("🚗 Phụ phí: ${phuPhi.toString().replace(Regex("(\\d)(?=(\\d{3})+(?!\\d))"), "$1.")} VND")
        println("Thanh Tien: ${formatNumber(tinhThanhTien())}")
        println("Phi Quang Cao: ${formatNumber(tinhPhiQuangCao())}")
        println("Thue: ${(tinhThue())}")
        println("➖➖➖➖➖")
    }
}