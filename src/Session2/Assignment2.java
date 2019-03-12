package Session2;


import java.util.Scanner;

public class Assignment2 {
    public int StudentCOde;
    public double MediumScore;
    public int age;
    public String Class;

    public void inputInfoStudent()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap Vao Ma Sinh Vien :");
        StudentCOde=scanner.nextInt();

        System.out.println("Diem Trung Binh :");
        MediumScore=scanner.nextDouble();

        System.out.println("Tuoi :");
        age=scanner.nextInt();

        System.out.println("Lop :");
        Class=scanner.next();
    }
    public void printInfo()
    {
        System.out.println("Thong Tin Sinh Vien");
        System.out.println("Ma Sinh Vien : "+StudentCOde+"; Diem Trung Binh :"+MediumScore+"; Tuoi :"+age+"; Lop Hoc :"+Class);
    }
    public void HocBong()
    {
        if (MediumScore>=8.0)
            System.out.println("Hoc Sinh Du Dieu Kien Nhan Hoc Bong");
        else
            System.out.println("Học Sinh Khong Du Dieu Kien Nhan Hoc Bong");
    }
}
