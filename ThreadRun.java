import java.util.*;

class ThreadRunCls implements Runnable{
     @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadRun {
    
    public static void main(String args[]){

        ThreadRunCls task=new ThreadRunCls();
        Thread t1=new Thread(task);
        t1.start();

        for(int i=1;i<= 5;i++) {
            System.out.println(i);
        }
    }
}
