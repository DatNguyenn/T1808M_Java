package Assignment4;

public class MainAssignment4 {
    public static void main(String[] args){
        SanPham sanPham1=new SanPham(1,"san pham 1",1000,5);
        SanPham sanPham2=new SanPham(2,"san pham 2", 2000,2);
        SanPham sanPham3=new SanPham(3,"san pham 3", 5000, 0);

        DonHang donHang1=new DonHang(1);
        donHang1.ThemSanPham(sanPham1,0);
        donHang1.ThemSanPham(sanPham2,20);
        donHang1.ThemSanPham(sanPham3,80);

        donHang1.InDonHang();

        DonHang donHang2=new DonHang(2);
        donHang2.ThemSanPham(sanPham2,90);

        donHang2.InDonHang();

        DonHang donHang3=new DonHang(3);
        donHang2.ThemSanPham(sanPham2,90);
        donHang3.InDonHang();
    }
}
