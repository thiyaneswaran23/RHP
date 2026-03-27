import java.util.*;

public class Diagonal{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        int[][] arr={{10,5,1000,20,30},{40,50,1200,6,7},{3,99,200,500,400},{10,11,2,100,300},{50,50,60,5,4}};
        int cur=arr.length+1;
        int sum=0;
        int[][] dp=new int[arr.length][arr[0].length];
        for(int i=0;i<arr[0].length;i++){
            dp[0][i]=arr[0][i];
        }
        for(int i=1;i<arr.length;i++){
            
            int temp=0;
            int first_idx=0;
            int second_idx=0;
            int first=Integer.MIN_VALUE;
            int second=Integer.MIN_VALUE;
            

        for(int k = 0; k < dp[i-1].length; k++) {

        if(dp[i-1][k] > first) {
        second = first;
        second_idx = first_idx;

        first = dp[i-1][k];
        first_idx = k;
        }
        else if(dp[i-1][k] > second) {
        second = dp[i-1][k];
        second_idx = k;
            }
            }
            System.out.println(second);
            

            for(int j=0;j<arr[0].length;j++){
                if(j!=first_idx){
                    dp[i][j]=arr[i][j]+first;
                }
                else{
                    dp[i][j]=arr[i][j]+second;
                }
                
               
            }
            


        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
       for(int i=0;i<dp[0].length;i++){
        sum=Math.max(sum,dp[dp.length-1][i]);
       }
       System.out.println(sum);
    }

}