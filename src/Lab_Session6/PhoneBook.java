package Lab_Session6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> PhoneList;

    @Override
    void insertPhone(String name, String phone) {
        for (PhoneNumber PN:this.PhoneList){
            if (PN.name.equals(name)){
                if (PN.phone.equals(phone)){
                    System.out.println("SDT da co");
                    return;
                }
                PN.phone+=":"+phone;
                System.out.println("Da Noi Thanh Cong 2 so");
                return;
            }
        }
        this.PhoneList.add(new PhoneNumber(name,phone));
        System.out.println("Da Them Thanh Cong");
    }

    @Override
    void removePhone(String name) {
        for (PhoneNumber PN:this.PhoneList){
            if (PN.name.equals(name)){
                this.PhoneList.remove(PN);
            }
        }
    }

    @Override
    void updatePhone(String name, String newPhone) {
        for (PhoneNumber PN:this.PhoneList){
            if (PN.name.equals(name)){
                PN.phone=newPhone;
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for (PhoneNumber PN:this.PhoneList){
            if (PN.name.equals(name)){
                System.out.println(PN.name+" -- "+PN.phone);
            }
        }
    }

    @Override
    void sort() {
        Collections.sort(this.PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }


}
