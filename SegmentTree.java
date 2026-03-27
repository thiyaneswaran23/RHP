




import java.util.*;
public class SegmentTree {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=8;
        int[] arr={7,10,4,5,2,3,6,5};
        

        int segmentLength=0;
        int tpow=0;
        while((1<<tpow)<n){
            tpow++;
        }
        tpow=(1<<tpow);
        segmentLength=tpow*2;
        int[] segment=new int[segmentLength];

        int idx=segmentLength/2;
        int x=0;
        for(int i=idx;i<segmentLength;i++){
            segment[i]=arr[x];
            x++;
        }
        idx--;
        for(int i=idx;i>=1;i--){
            int ans=segment[2*i+1]+segment[2*i];
            segment[i]=ans;

        }

        System.out.println(Arrays.toString(segment));
    }
}
