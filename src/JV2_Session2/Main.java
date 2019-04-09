package JV2_Session2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        plus(5,7,4,5);
        plus(3.544534,2.546546,2,3);
        plus("aaa","bbb",2,3);

        MyGeneric<String,Integer> myGeneric=new MyGeneric<>();
        ArrayList<String> arrayList=new ArrayList<>();
        myGeneric.check(233);

        MyGerericArrayList<Integer> myArr= new MyGerericArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<5;i++){
            Integer x;
            do {
                System.out.println("Nhap 1 so:");
                x=scanner.nextInt();
            }
            while (x>10 || x<1);
            myArr.arrayNumber.add(x);
        }
        for (Integer i:myArr.arrayNumber){
            System.out.println(i);
        }
    }
    public static<E,X,Y> void plus(E a,E b,X x,Y y){
        if (a instanceof Integer){
            Integer k=(Integer)a+(Integer)b;
            System.out.println(k);
        }
        else if (a instanceof Double){
            Double k=(Double)a+(Double)b;
            System.out.println(k);
        }
        else {
            System.out.println("Khong Tinh Toan Duoc");
        }
    }
    public static <T> T changeValue(T obj){
        return obj;
    }
    public static <N> void showRandonNumber(N n){
        Random random=new Random();
        if (n instanceof Integer){
            Integer x=random.nextInt();
            System.out.println(x);
            while (x<=(Integer)n){
                x=random.nextInt();
            }
            System.out.println("Random number: "+x);
        }
        else if (n instanceof Double){
            Double x=random.nextDouble();
            while (x<=(Double)n){
                x+=random.nextDouble();
            }
            System.out.println("Random Number: "+x);
        }
        else {
            System.out.println("Khong Tinh Duoc");
        }
    }
}
