class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int m=arr[0];
        int s=-1;
        for(int i=0;i<arr.length;i++){
            if(m>arr[i] && s<arr[i]) s=arr[i];
            else if(m< arr[i] && s<arr[i]) {
                s=m;
                m=arr[i];
            } 
            
        }
        return s;
    }
}