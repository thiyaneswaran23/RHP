




import java.util.*;
import java.io.*;
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
public class MinimumQuery {
    public static void main(String[] args) {
        FastScanner in=new FastScanner();
        int n=in.nextInt();
        int q=in.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextLong();

        }
        


        

        int tpow = 1;
        while(tpow < n) {
            tpow*=2;
        }

        int segmentLength = tpow * 2;
        long[] segment = new long[segmentLength];
        Arrays.fill(segment,Integer.MAX_VALUE);

        int idx = tpow;
        int x = 0;
        for (int i = idx; i < n + idx; i++) {
            segment[i] = arr[x++];
        }

        for (int i = tpow - 1; i >= 1; i--) {
            segment[i] = Math.min(segment[2*i] ,segment[2 * i + 1]);
        }
        StringBuilder ans=new StringBuilder();

        for (int i = 0; i < q; i++) {
            int op = in.nextInt();
            int val1 = in.nextInt();
            long val2 = in.nextLong();

            if (op == 2) {
                ans.append(find(segment, 1, tpow, val1,(int) val2, 1)).append('\n');
            } 
            else if (op == 1) {
                update(segment, tpow + val1 - 1, val2);
            }
        }
        System.out.println(ans);
    

      
      
    }
    public static long find(long[] segment,int start,int end,int start_range,int end_range,int node){

        if(start>end_range || end<start_range){
            return Integer.MAX_VALUE;
        }
      
        if((start>=start_range && end<=end_range)){
            return segment[node];
        }
        int mid=(start+end)/2;
        
         return Math.min(find(segment, start,mid, start_range, end_range,node*2),find(segment, mid+1, end, start_range, end_range,node*2+1));
            }

            public static void update(long[] segment,int idx,long updated_value){
                segment[idx]=updated_value;
                while(idx>=1){
                    int i=idx/2;
                    segment[i]=Math.min(segment[i*2],segment[i*2+1]);
                    idx=i;
                }

            }
}
