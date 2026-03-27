import java.util.*;
public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            pq.add(-i*3);
            
        }
        for(int i=0;i<5;i++){
            pq.add(-i*4);

        }
        while(!pq.isEmpty()){
            System.out.print(-pq.poll()+" ");
        }

    }
}
