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
public class Labyrinth {
    public static void main(String[] args) {
        FastScanner in=new FastScanner();
    
        int n=in.nextInt();
        int m=in.nextInt();
        char arr[][] = new char[n][m];
        for(int i=0;i<n;i++){
            String a=in.nextToken();
            for(int j=0;j<m;j++){
                arr[i][j]=a.charAt(j);
                
                
            }
        }
        int ans=0;
        int startrow=0,startcol=0;
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(arr[i][j]=='A'){
                    startrow=i;
                    startcol=j;
                    i=n+100;
                    break;
                }
            }
        }
        int[][] visited=new int[n][m];
        for(int i=0;i<visited.length;i++){
            Arrays.fill(visited[i],-1);
        }
        boolean chk=false;
        Queue<int[]> queue=new LinkedList<>();
        StringBuilder path=new StringBuilder();
        queue.add(new int[]{startrow,startcol});
        int[] dir={1,0,-1,0,1};
        int brow=0;
        int bcol=0;
        String road="DLUR";
        while(!queue.isEmpty() && !chk){
            int[] cur=queue.poll();
            for(int i=0;i<4;i++){
                int ar=cur[0]+dir[i];
                int ac=cur[1]+dir[i+1];
                char side;
                if(i==0){
                    side='D';
                }
                else if(i==1){
                    side='L';
                }
                else if(i==2){
                    side='U';
                }
                else{
                    side='R';
                }
               
                if(ar>=0 && ac>=0 && ar<arr.length && ac<arr[0].length &&(arr[ar][ac]=='.'||arr[ar][ac]=='B')){
                    if(arr[ar][ac]=='B'){
                    visited[ar][ac]=i;
                    chk=true;
                    brow=ar;
                    bcol=ac;
                    
                    
                    break;
                }
                else{
                    queue.offer(new int[]{ar,ac});
                    visited[ar][ac]=i;
                    arr[ar][ac]='#';
                    
                }
                }
                if(chk){
                    break;
                }

            }

        }
        
        if(chk){
            System.out.println("YES");
            while(arr[brow][bcol]!='A'){
                
                    int didx=visited[brow][bcol];
                    path.append(road.charAt(didx));
                    brow=brow-dir[didx];
                    bcol=bcol-dir[didx+1];
                   
                
            
        }
        System.out.println(path.length());
        System.out.println(path.reverse());

        }
        else{

        System.out.println("NO");
        }
        

    }
    
}
 
