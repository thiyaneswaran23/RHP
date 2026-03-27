import java.util.*;

public class Colour{
    public static void main(String args[]){
        
        Scanner in=new Scanner(System.in);

        int g[]={0,1,2,1,3};
        int color[]={4,3,4,3,5};
        int queries[]={4,3,3};
        HashMap<Integer,ArrayList<Integer>> adj=new HashMap<>();
        for(int i=0;i<g.length;i++){
            adj.put(i,new ArrayList<>());
        }
        
        for(int i=0;i<g.length;i++){
            adj.get(g[i]).add(i+1);
        }
        System.out.println(adj);
        int ans=0;
        HashMap<Integer,Integer> cache=new HashMap<>();

        for(int i=0;i<queries.length;i++){
            if(cache.containsKey(queries[i])){
                ans+=cache.get(queries[i]);
                continue;
            }
           
           int temp=dfsColour(color,adj,queries[i],new HashSet<>());
           cache.put(queries[i],temp);
           System.out.println(temp);
        ans+=temp;

        }
        System.out.println(ans);
        
    }
    public static int dfsColour(int[] color,HashMap<Integer,ArrayList<Integer>> adj,int start,HashSet<Integer> visited){
        boolean chk=false;
        if(visited.contains(color[start])){
            chk=true;
            visited.add(color[start]);
        }
        
        int maxNodes=0;
        for(int i:adj.get(start)){
         
                
                maxNodes=Math.max(maxNodes,dfsColour(color, adj, i, visited));
            

            
        }
        if(chk){
            maxNodes+=1;
        }
        return maxNodes;

    }
    
    
}
