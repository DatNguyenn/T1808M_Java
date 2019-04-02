package Assignment7;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.security.PublicKey;
import java.util.Scanner;

public class SinhVien {
    public Integer ID;
    public String Name;
    public Integer Age;
    public String Address;
    public double Gpa;

    public SinhVien() {
    }

    public SinhVien(Integer ID, String name, Integer age, String address, double gpa) {
        this.ID = ID;
        Name = name;
        Age = age;
        Address = address;
        Gpa = gpa;
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

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getGpa() {
        return Gpa;
    }

    public void setGpa(double gpa) {
        Gpa = gpa;
    }

    public void Menu(){
        System.out.println("Cac Chuc Nang:");
        System.out.println("1.Add Student.");
        System.out.println("2.Edit student by id.");
        System.out.println("3.Delete student by id.");
        System.out.println("4.Sort student by gpa.");
        System.out.println("5.Sort student by name.");
        System.out.println("6.Show student.");
        System.out.println("0.Exit");
    }
    public void ChonChucNang(){
        Integer Chon;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi Ban Chon Chuc Nang:");
        Chon=scanner.nextInt();
        switch (Chon){
            case 1:
                System.out.println("Thuc Hien Chuc Nang 1.Add Student.");
                break;
            case 2:
                System.out.println("Thuc Hien Chuc Nang 2.Edit Student by id.");
                break;
            case 3:
                System.out.println("Thuc Hien Chuc Nang 3.Delete Student by id.");
                break;
            case 4:
                System.out.println("Thuc Hien Chuc Nang 4.Sort Student by gpa.");
                break;
            case 5:
                System.out.println("Thuc Hien Chuc Nang 5.Sort Student by name.");
                break;
            case 6:
                System.out.println("Thuc Hien Chuc Nang 6.Show Student.");
                break;
            case 0:
                System.out.println("Exit.");
                break;
        }
    }
}
