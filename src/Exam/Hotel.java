package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel extends ArrayHotel {
    public ArrayList<ArrayHotel> HotelList;

    public void InputHotel(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Information");

        System.out.println("Enter Name:");
        this.setName(scanner.hasNext()?scanner.nextLine():"");

        System.out.println("Enter Location:");
        this.setLocation(scanner.hasNext()?scanner.nextLine():"");

        System.out.println("Enter OwnerName:");
        this.setOwnerName(scanner.hasNext()?scanner.nextLine():"");
    }


    public void InforHotel(){
        System.out.println("Hotel Details");
        System.out.println("Name: "+getName());
        System.out.println("Location: "+getLocation());
        System.out.println("OwnerName: "+getOwnerName());
    }

    public void SearchOwnerName(String OwnerName){
        for (ArrayHotel PN:this.HotelList){
            if (PN.OwnerName.equals(OwnerName)){
                System.out.println(PN.Name+PN.Location+" ");
            }
        }
    }

}
