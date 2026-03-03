import java.util.*;
 class ThreadCls extends Thread{
@Override
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPrg{

    public static void main(String args[]){
          ThreadCls t1=new ThreadCls();
        t1.start();  

        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }
    }
}