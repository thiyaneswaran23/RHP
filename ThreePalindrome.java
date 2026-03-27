
import java.util.*;
public class ThreePalindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int left[]=new int[26];
        int right[]=new int[26];

        String n=in.nextLine();
        for(char j:n.toCharArray()){
            right[j-'a']+=1;
        }
        int ans=0;
        for(int i=0;i<n.length();i++){
            char a=n.charAt(i);
            int idx=a-'a';
            right[idx]-=1;
        
            int temp=0;
            for(int k=0;k<26;k++){
                temp+=right[k]*left[k];

            }
            ans+=temp;
            left[idx]+=1;

        }
        System.out.println(ans);

    }
}
