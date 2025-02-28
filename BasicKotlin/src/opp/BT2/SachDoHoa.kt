package opp.BT2

class SachDoHoa(
    maSach: String,
    tenSach: String,
    tacGia: String,
    soTrang: Int,
    giaBan: Double,
    var soLuongHinhVe: Int,
    var mauSach: Boolean
) : Sach(maSach, tenSach, tacGia, soTrang, giaBan),Phi {


    fun ChiPhi():Double {
        return if (mauSach) soLuongHinhVe * 2000.0 else soLuongHinhVe * 1200.0
    }

    override fun PhiBiaBaoVe(): Double {
       return 50.000
    }

    override fun PhiUopThomSach(): Double {
        return soTrang * 200.0
    }
}
