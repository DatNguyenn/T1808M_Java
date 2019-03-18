package Assignment5;

import java.util.Scanner;

public class Person {
    public String Ten;
    public String GioiTinh;
    public Integer NgaySinh;

    public Person() {
    }

    public Person(String ten, String gioiTinh, Integer ngaySinh) {
        Ten = ten;
        GioiTinh = gioiTinh;
        NgaySinh = ngaySinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public Integer getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Integer ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public void InputInfoPerson(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap Ten:");
        this.setTen(scanner.hasNext()?scanner.nextLine():"");

        System.out.println("Gioi Tinh:");
        this.setGioiTinh(scanner.hasNext()?scanner.nextLine():"");

        System.out.println("Ngay Sinh");
        this.setNgaySinh(scanner.hasNext()?scanner.nextInt():1);
    }

    public void ShowInfoPerson(){
        System.out.println("Ten :"+getTen()+" Gioi Tinh :"+getGioiTinh()+" Ngay Sinh :"+getNgaySinh());
    }
}
