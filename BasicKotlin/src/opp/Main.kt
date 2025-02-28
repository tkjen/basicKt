package opp

import opp.model.BieuDienTaiNha
import opp.model.BieuDienTaiRapNho
import opp.model.HopDongCaSi


fun main()
{
    val hopDong = BieuDienTaiRapNho("HD1234", "Ca sĩ A", 5000000, 25,2)
    hopDong.hienThiThongTin()
    val tienHoTro = hopDong.TienHoTro()
    println("Tien ho tro la: $tienHoTro")


}
