package Assignment4;

import java.util.ArrayList;

public class DonHang {
    public Integer ID;
    public double tongTien;
    public ArrayList<SanPham> dsSanPham;

    public DonHang(Integer ID) {
        this.ID = ID;
        this.tongTien = 0.0;
        this.dsSanPham = new ArrayList<>();
    }

    public void ThemSanPham(SanPham sanPhamX, int sale){
        if (sanPhamX.getQty()<=0){
            System.out.println("San Pham Het Hang");
            return;
        }
        if (sale>0)
        {
            this.tongTien=this.tongTien+(100-sale)*sanPhamX.getPrice()/100;
        }
        else {
            this.tongTien+=sanPhamX.getPrice();
        }
        this.tongTien+=sanPhamX.getQty();
        //sanPhamX.setQty(sanPhamX.getID()-1);
        int tmp=sanPhamX.getQty()-1; //dùng để trừ đi 1 số lượng sản phẩm bên Class Sản Phảm
        sanPhamX.setQty(tmp);
        this.dsSanPham.add(sanPhamX);
        System.out.println("Da Them San Pham "+sanPhamX.getName()+" Vao Don Hang");
    }
    public void InDonHang(){
        System.out.println("Tong Tien: "+this.tongTien);
    }

}
