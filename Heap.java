import java.util.*;

public class Heap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        PriorityQueue<Integer> pq2=new PriorityQueue<>();
        int t;
        for(int i=0;i<n;i++){
            t=in.nextInt();
            pq1.add(t);
        }
        for(int i=0;i<n;i++){
            t=in.nextInt();
            pq2.add(-t);
        }

        int ans=0;

        int MOD=1_000_000_007;

        for(int i=0;i<n;i++){
            int one=pq1.poll();
            int zero=-pq2.poll();

            while(one-- >0){
                ans=((ans*2)+1)%MOD;
            }
            while(zero-- >0){
                ans=(ans*2)%MOD;
            }

        }
        System.out.println(ans);
    }
    
}
