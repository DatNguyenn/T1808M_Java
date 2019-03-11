package Session2;

import java.util.Scanner;

public class NhanVien {
    public String name;
    public  int age;
    public String address;
    public double salary;
    public int workingTime;

    public void inputInfo()
    {
        System.out.println("Nhap Ten Nhan Vien :");
        Scanner scanner=new Scanner(System.in);
        name=scanner.nextLine();

        System.out.println("Nhap tuoi :");
        age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap Dia Chi :");
        address=scanner.nextLine();

        System.out.println("Nhap Tien Luong :");
        salary=scanner.nextDouble();

        System.out.println("Nhap thoi gian lam :");
        workingTime=scanner.nextInt();
    }
    public void printInfo()
    {
        System.out.println("Thong Tin Nhan Vien :");
        System.out.println("Ten :"+name+" Tuoi :"+age+" Dia Chi :"+address+" Tien Luong"+salary+" Thoi Gian Lam :"+workingTime);
    }
    public double tinhThuong()
    {
        double thuong=0;
        if (workingTime>=200) {
            thuong = salary * 20 / 100;
        }
        else if (workingTime<200 && workingTime >=100){
            thuong=salary*10/100;
        }
        return thuong;
    }
}
