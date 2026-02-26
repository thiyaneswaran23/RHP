import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();  
        int fg = 0;
        for (char i : s.toCharArray()) {
            fg = fg ^ (1 << (i - 'a'));
        }
        if (fg == 0 || ((fg & (fg - 1)) == 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}