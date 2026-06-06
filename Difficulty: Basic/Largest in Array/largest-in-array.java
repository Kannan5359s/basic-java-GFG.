class Solution {
    public static int largest(int[] arr) {
        // code here
        int m=arr[0];
        for(int i=1;i<arr.length;i++){
            if(m<arr[i]) m=arr[i];
        }
        return m;
    }
}
