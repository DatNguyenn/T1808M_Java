package Session1;

import java.util.Scanner;

public class Assignment1a {
    public static void main(String[] args)
    {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi ban nhap mot so tu ban phim :");
        n=scanner.nextInt();
        if(n>=2)
        {
            if (n==2)
                System.out.println(n+" la so nguyen to");
            else if (n==3)
                System.out.println(n+" la so nguyen to");
            else if (n==5)
                System.out.println(n+" la so nguyen to");
            else if (n%2==0)
                System.out.println(n+" khong phai la so nguyen to");
            else if (n%3==0)
                System.out.println(n+" khong phai la so nguyen to");
            else if (n%5==0)
                System.out.println(n+" khong phai la so nguyen to");
            else
                System.out.println(n+" la so nguyen to ");

        }
        else
            System.out.println(n+" khong phai la so nguyen to");
    }
}
