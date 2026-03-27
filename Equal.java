import java.util.*;

public class Equal{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int[] nums=new int[n];
        for (int idx = 0; idx < n; idx++) {
            nums[idx]=in.nextInt();
            
        }
        System.out.println(findAns(nums));
    }

    static int findAns(int[] nums){
    int ans=0;
        Map<Integer,Integer> hm=new HashMap<>();
        int ctrl=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ctrl-=1;
                if(!hm.containsKey(ctrl)){
                    hm.put(ctrl,i);
                }
                else{
                    ans=Math.max(ans,i-hm.get(ctrl));
                }
            }
            else{
                ctrl+=1;
                 if(!hm.containsKey(ctrl)){
                    hm.put(ctrl,i);
                }
                else{
                    ans=Math.max(ans,i-hm.get(ctrl));
                }
            }

        }
        return ans;
 
}
}