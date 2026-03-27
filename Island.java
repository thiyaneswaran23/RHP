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
public class Island {
    public static void main(String[] args) {
        FastScanner in=new FastScanner();
    
        int n=in.nextInt();
        int m=in.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            String a=in.nextToken();
            for(int j=0;j<m;j++){
                if(a.charAt(j)=='#'){
                    arr[i][j]=1;
                }
                
                
            }
        }
        int ans=0;
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    dfs(arr,i,j);
                        ans+=1;
                }
            }
        }
        System.out.println(ans);
        

    }
    public static void dfs(int[][] arr,int i,int j){
        if(i<0 || j<0 || i>arr.length-1 || j>arr[0].length-1 || arr[i][j]!=0){
            return;
        }
        arr[i][j]=2;
        
        dfs(arr,i+1,j);
        
        dfs(arr,i-1,j);
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);   
    }
}
