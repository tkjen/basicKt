package opp.model

class BieuDienTaiRapNho(maHopDong: String, tenCaSi: String, donGia: Int, soTietMuc: Int, var quiMo: Int)
    : HopDongCaSi(maHopDong, tenCaSi, donGia),HoTro {  // Truyền soTietMuc lên lớp cha

    init {
        this.soTietMuc = soTietMuc  // Gán giá trị trong init
    }

    override fun tinhPhiQuangCao(): Int {
        return if (quiMo in 1..5) {
            10000000 + 2000000 * soTietMuc
        } else {
            println("❌ Qui mô không hợp lệ!")
            0
        }
    }

    override fun TienHoTro(): Int {
        return if (quiMo in 1..3) 1_000_000 else 0
    }
}
