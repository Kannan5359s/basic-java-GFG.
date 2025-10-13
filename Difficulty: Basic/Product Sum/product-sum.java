// User function Template for Java
class Solution {
    static long countDigits(long a, long b) {
        // code here
        long m=a*b;
        if (m<0)
            m=Math.abs(m);
        
        String mu=String.valueOf(m);
        
        return mu.length();
    }
}