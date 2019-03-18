package Assignment3;

public class MainPhanSo {
    public static void main(String[] args){
        PhanSo phanSo1=new PhanSo();
        phanSo1.NhapVaoPhanSo();
        phanSo1.inRaPhanSo();
        phanSo1.rutGon();
        phanSo1.NghichDaoPS();
        PhanSo phanSo2=new PhanSo(3,4);
        phanSo1.CongPs(phanSo2);
        phanSo1.truPs(phanSo2);

    }

}

