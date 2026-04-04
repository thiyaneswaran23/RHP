import java.util.*;

public class Increasing {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        long ans=0;
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }
            else{
                int temp=arr[i+1]-arr[i];
                ans+=Math.abs(temp);
                arr[i+1]=arr[i];
            }
        }
        System.out.println(ans);
    }
}
