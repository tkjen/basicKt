package opp.model

class BieuDienTaiNha(maHopDong: String, tenCaSi: String, donGia: Int,
                     val khoangCach: Int) : HopDongCaSi(maHopDong, tenCaSi, donGia) {

    override fun tinhPhiQuangCao(): Int {
        return if (khoangCach < 20) {
            khoangCach * 400000
        } else {
            minOf(khoangCach * 300000, 15000000)
        }
    }
}