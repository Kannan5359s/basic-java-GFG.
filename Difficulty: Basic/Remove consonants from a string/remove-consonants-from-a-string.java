// User function Template for Java

class Solution {
    public String removeConsonants(String s) {
        String vow="aeiouAEIOU";
        StringBuilder r=new StringBuilder();
        for (char ch:s.toCharArray()){
            if (vow.indexOf(ch) != -1){
                r.append(ch);
            }
            else
                continue;
        }
        if (r.length()==0)
            return "No Vowel";
        else
            return r.toString();
    }
}
