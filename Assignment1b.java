package Session1;

import java.util.Scanner;

public class Assignment1b {
    public static void main(String [] args){
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("moi ban nhap mot so tu ban phim :");
        n=scanner.nextInt();
        for (int i=0;i<n;i++)
            System.out.println(n+"so dau trong day Fibonacci : "+fibonacci(i));
    }
    static long fibonacci(int n){
        long f0=0, f1=1,fn=0;
        if ( n==1) fn=n;
        else for (int i=2;i<=n;i++)
        {
            fn=f0+f1;
            f0=f1;
            f1=fn;
        }
        return fn;
    }
}