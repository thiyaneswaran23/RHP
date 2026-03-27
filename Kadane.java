
import java.io.*;
import java.util.*;

class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String nextToken() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(nextToken());
		}
		long nextLong() {
			return Long.parseLong(nextToken());
		}
		double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

public class Kadane {
    public static void main(String[] args) {
        FastScanner in=new FastScanner();
        int n=in.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextLong();
        }
       
        long ans=0;
        long ans1=Integer.MIN_VALUE;

        long sum=0;
        for(int i=0;i<n;i++){
            sum=(sum+arr[i]);
            if(sum<0){
                sum=0;
            }
            ans=Math.max(ans,sum);
            ans1=Math.max(ans1,arr[i]);
        }
        if(ans==0){
            
            System.out.println(ans1);
        }
        else{
        System.out.println(ans);
        }
        
    }
}
