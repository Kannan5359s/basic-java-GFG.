//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if (a<b){
            if (b>c)
                System.out.println(b);
            else
                System.out.println(c);
        }
        else
            System.out.println(a);
    }
}