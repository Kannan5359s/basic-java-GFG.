// User function template for Java

class Solution {
    static String toLower(String s) {
        // code here
        StringBuilder l=new StringBuilder();
        for(char ch:s.toCharArray()){
            int lp=(int)ch;
            if(lp >=65 && lp<=90 ){
                lp+=32;
                l.append((char)lp);
            
            }
            else l.append((char)lp);
        }
        return l.toString();
    }
}