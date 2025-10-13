// User function Template for Java

class Solution {
    String minimumLuckyNumber(int N) {
        String s="";
        while(N>0)
        {
            if(N % 7 == 0)
            {
                s += '7';
                N = N-7;
            }
            else
            {
                s += '4';
                N = N-4;
            }
            if(N==0)
                return s;
        }
        return "-1";
        
    }
}