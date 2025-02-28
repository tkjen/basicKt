package opp.BT2



fun main()
{
   var sachDH = SachDoHoa("DH001",
       "Mỹ thuật sáng tạo",
       "Lê Hòa",
       150,
       5.000,
       30,  // 30 hình vẽ
       true )
    sachDH.xuatThongTin()
    println("Chi Phi: ${sachDH.ChiPhi()} VND")
    println("Phi Uop Vang: ${sachDH.PhiUopThomSach()} VND")
    println("Phi Bao Ve: ${sachDH.PhiBiaBaoVe()} VND")
}