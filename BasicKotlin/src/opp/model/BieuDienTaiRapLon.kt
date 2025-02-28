package opp.model

class BieuDienTaiRapLon(maHopDong:String,tenCaSi:String,donGia:Int,var soLuongKhanGia:Int)
    :HopDongCaSi(maHopDong, tenCaSi, donGia),HoTro
{
    override fun tinhPhiQuangCao(): Int {
      return if(soLuongKhanGia < 1000000) 30000000 else 50000000
    }

    override fun TienHoTro(): Int {
      return minOf((soLuongKhanGia/ 100000) * 1000000, 20000000)
    }
}