package Lab_Session5;

import Assignment4.SanPham;

public class ThoiTrang extends SanPham {
     public String Brand;

     public ThoiTrang(Integer ID,String Name,Double Price,Integer qty,String Brand){
         super(ID,Name,Price,qty);
         this.Brand=Brand;
     }

}
