package opp.model

import java.util.Date

abstract class HopDongCaSi {
    private var maHopDong: String
    var tenCaSi: String
    var soTietMuc: Int
    var ngayBieuDien: String
    private var donGia: Int
    var phuPhi: Int

    companion object{
        const val TAX_RATE = 0.15 // ti le thue chung
    }

    // Constructor mặc định
    constructor() {
        this.maHopDong = "HD3418"
        this.tenCaSi = "Lý Không Hay"
        this.soTietMuc = 3
        this.ngayBieuDien = "24/10/2020"
        this.donGia = 4000000
        this.phuPhi = 2000000
    }

    // Constructor có tham số

    constructor(maHopDong:String,tenCaSi:String,donGia:Int)
    {
        if (!maHopDong.matches(Regex("^HD\\d{4}$"))) {
            throw IllegalArgumentException("⚠️ Mã hợp đồng không hợp lệ! Phải có 6 ký tự, bắt đầu bằng 'HD' và 4 số.")
        }
        if (donGia <= 0) {
            throw IllegalArgumentException("⚠️ Đơn giá phải là một số dương!")
        }

        this.maHopDong = maHopDong
        this.tenCaSi = tenCaSi
        this.soTietMuc = 2
        this.ngayBieuDien = "24/12/2020"
        this.donGia = donGia
        this.phuPhi = 0
    }
// 1 cai abstract truu tuong
    abstract fun tinhPhiQuangCao():Int

    fun tinhThanhTien():Int
    {
        return donGia * soTietMuc + phuPhi + tinhPhiQuangCao()
    }
    fun tinhThue():Double {
        return  tinhThanhTien() * TAX_RATE
    }




    // Getter cho mã hợp đồng
    fun getMaHopDong(): String {
        return maHopDong
    }

    // Setter cho mã hợp đồng
    fun setMaHopDong(maHD: String) {
            if (maHD.matches(Regex("^HD\\d{4}$"))) {
            this.maHopDong = maHD
        } else {
            println("⚠️ Mã hợp đồng không hợp lệ! Phải có 6 ký tự, bắt đầu bằng 'HD' và 4 số.")
        }
    }

    // Getter cho đơn giá
    fun getDonGia(): Int {
        return donGia
    }

    // Setter cho đơn giá
    fun setDonGia(gia: Int) {
        if (gia > 0) {
            this.donGia = gia
        } else {
            println("⚠️ Đơn giá phải là một số dương!")
        }
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
