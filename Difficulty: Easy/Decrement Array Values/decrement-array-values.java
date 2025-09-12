class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        int n=arr.length;
        int[] r=new int[n];
        for(int i=0;i<n;i++){
            r[i]=arr[i]-1;
        }
        return r;
        
    }
}