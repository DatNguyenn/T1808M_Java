package Assignment4;

public class SanPham {
    public Integer ID;
    public String Name;
    public double Price;
    public Integer qty;

    public SanPham() {
    }

    public SanPham(Integer ID, String name, double price, Integer qty) {
        this.ID = ID;
        Name = name;
        Price = price;
        this.qty = qty;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }


}
