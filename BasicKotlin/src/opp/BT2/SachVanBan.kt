package opp.BT2

class SachVanBan( maSach: String,
                  tenSach: String,
                  tacGia: String,
                  soTrang: Int,
                  giaBan: Double,
    var chitietTK:Double
    ):Sach(maSach, tenSach, tacGia, soTrang, giaBan) {

        fun ChiPhi():Double {
            return giaBan * 0.4 + chitietTK
        }


}