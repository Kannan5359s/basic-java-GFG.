// User function Template for Java
class Solution {

    String modify(String s) {
        // your code here
        char sp=' '; 
        StringBuilder r=new StringBuilder();
        for(char ch:s.toCharArray()){
            if (ch==sp) 
                continue;
            r.append(ch);
            
        }
        return r.toString();
    }
}