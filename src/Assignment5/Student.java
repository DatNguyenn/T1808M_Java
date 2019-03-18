package Assignment5;

public class Student extends Person {
    public Student(String Ten,String GioiTinh,Integer NgaySinh){
        super(Ten,GioiTinh,NgaySinh);
    }

    public void KiemTraTuoi(){
        if (this.getNgaySinh()<=2001){
            System.out.println("Da Du 18 Tuoi");
        }
        else
            System.out.println("Chua Du 18 Tuoi");
    }
}
