public class SubMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15,16}
        };

        int n = arr.length;
        int m = arr[0].length;

        int sr = 1, sc = 1; 
        int er = 3, ec = 2;  

        int[][] prefix=new int[n][m];
        prefix[0][0]=arr[0][0];
        for(int i=1;i<n;i++){
            prefix[i][0]=prefix[i-1][0]+arr[i][0];
        }
        for(int i=1;i<m;i++){
            prefix[0][i]=prefix[0][i-1]+arr[0][i];
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                prefix[i][j]=prefix[i][j-1]+prefix[i-1][j]-prefix[i-1][j-1]+arr[i][j];

            }
        }
        int full_sum=prefix[er][ec];
        int ans=full_sum-prefix[er][sc-1]-prefix[sr-1][ec]+prefix[sr-1][sc-1];
        System.out.println(ans);
    }
}
