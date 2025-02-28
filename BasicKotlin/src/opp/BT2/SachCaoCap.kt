package opp.BT2

class SachCaoCap( maSach: String,
                  tenSach: String,
                  tacGia: String,
                  soTrang: Int,
                  giaBan: Double,
                    var chatLieu:String,
                    var phiThue:Double
    ):Sach(maSach, tenSach, tacGia, soTrang, giaBan) ,Phi{

        fun ChiPhi():Double {
            return phiThue + 0.5 * giaBan
        }

    override fun PhiUopThomSach(): Double {
       return soTrang*300.0
    }

    override fun PhiBiaBaoVe(): Double {
        return 80.000
    }
}