import java.util.*;
class Generate {
    public static List<String> generateCombinations(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(0, s, new StringBuilder(), ans);
        return ans;
    }
   static void backtrack(int index, String s, 
                           StringBuilder path, 
                           List<String> ans) {
        if (index == s.length()) {
            if (path.length() > 0) ans.add(path.toString());
            return;
        }
        path.append(s.charAt(index));
        backtrack(index + 1, s, path, ans);
        path.deleteCharAt(path.length() - 1);
        backtrack(index + 1, s, path, ans);
    }
    public static void main(String []args) {
        Scanner in=new Scanner(System.in);
    
        String inp=in.next();
        List<String> ans=generateCombinations(inp);
        System.out.println(ans);
        in.close();

    }
}