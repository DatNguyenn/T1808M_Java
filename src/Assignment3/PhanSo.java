
package Assignment3;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Scanner;

public class PhanSo {

    public int tu,mau;

    public ArrayList USC;

    public PhanSo(ArrayList USC) {
        this.USC = USC;
    }

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public void NhapVaoPhanSo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi Ban Nhap Mau So:");
        this.setTu(scanner.hasNextInt()?scanner.nextInt():1);

        System.out.println("Moi Ban Nhap Mau So:");
        this.setMau(scanner.hasNextInt()?scanner.nextInt():1);
    }
    public void inRaPhanSo(){
        if (this.getMau()>0)
        {
            System.out.println(this.getTu()+"/"+this.getMau());
        }
        else
            System.out.println("Moi ban nhap lai phan so!");
    }

    public int USCLN()
    {
        int usc =1;
        int absTuSo=Math.abs(this.getTu());
        int absMauSo=Math.abs(this.getMau());
        //Math.abs la lay gia tri tuyet doi

        for (int i=2;i<=Math.min(absTuSo,absMauSo);i++){
            //Math.min la tim so nho nhat giua 2 so
            if (absTuSo%i==0 && absMauSo%i==0){
                usc=i;
            }
        }
        return usc;
    }

    public void rutGon()
    {
        int usc=this.USCLN();
        this.setTu(this.getTu()/usc);
        this.setMau(this.getMau()/usc);
        System.out.println("Phan So Sau Khi Duoc Rut Gon: "+getTu()+"/"+getMau());
    }
    public void NghichDaoPS(){
        int tmp=this.getMau();
        this.setMau(this.getTu());
        this.setTu(tmp);
    }

    //cong PS
    public void CongPs(PhanSo ps2)
    {
        int AddTuSo=this.getTu()*ps2.getMau()+this.getMau()*ps2.getTu();
        int AddMauSo=this.getMau()*ps2.getMau();
        PhanSo result=new PhanSo(AddTuSo,AddMauSo);
        result.rutGon();
        System.out.println("Tong 2 phan so:" +result.getTu()+"/"+result.getMau());
    }
    public void truPs(PhanSo ps2)
    {
        int SubTuSo=this.getTu()*ps2.getMau()-this.getMau()*ps2.getTu();
        int SubMauSo=this.getMau()*ps2.getMau();
        PhanSo result=new PhanSo(SubTuSo,SubMauSo);
        result.rutGon();
        System.out.println("Hieu 2 phan so:" +result.getTu()+"/"+result.getMau());
    }
    public void nhanPs(PhanSo ps2)
    {
        int MulTuSo=this.getTu()*ps2.getTu();
        int MulMauSo=this.getMau()*ps2.getMau();
        PhanSo result=new PhanSo(MulTuSo,MulMauSo);
        result.rutGon();
        System.out.println("Nhan 2 phan so: "+result.getTu()+"/"+result.getMau());
    }
    public void div(PhanSo ps2){
        if(ps2.getTu() == 0){
            System.out.println("khong the chia");
            return;
        }
        int DivTuSo = this.getTu()*ps2.getMau();
        int DivMauSo = this.getMau()*ps2.getTu();

        PhanSo result = new PhanSo();
        result.rutGon();

        System.out.println("Tich 2 phan so:" + result.getTu()
                +"/"+result.getMau());
    }


}