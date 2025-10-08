// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int og=n;
        int s=0;
        while(n>0){
            int d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        return s==og;
    }
}