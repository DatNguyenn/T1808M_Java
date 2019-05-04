package JV2_Assignment3;

public class thread3 extends Thread{
    public void run(){
        try {
            for (int i=1;i<=50;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (Exception e){}
    }
}
