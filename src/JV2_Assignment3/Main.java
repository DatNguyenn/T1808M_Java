package JV2_Assignment3;

public class Main {
    public static void main(String[] args){
        thread1 thread1=new thread1();
        thread2 thread2=new thread2();
        thread3 thread3=new thread3();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
