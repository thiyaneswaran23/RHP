import java.util.*;
public class Lower
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int f = 0;
        for (char i : s.toCharArray()) {
            if (i >= 'a' && i <= 'z') {
                f = f|(1<<(i-'a'));
            }
        }
        if (f == (1 << 26) - 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}