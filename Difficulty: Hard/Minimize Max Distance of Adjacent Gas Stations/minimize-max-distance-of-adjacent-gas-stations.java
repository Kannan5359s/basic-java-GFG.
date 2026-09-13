class Solution {

    public static int required(int[] arr, double dist) {
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            int gap = arr[i] - arr[i - 1];

            int req = (int) Math.ceil(gap / dist) - 1;

            count += req;
        }

        return count;
    }

    public double minMaxDist(int[] stations, int k) {

        double low = 0;
        double high = 0;

        for (int i = 1; i < stations.length; i++) {
            high = Math.max(high, stations[i] - stations[i - 1]);
        }

        double diff = 1e-6;

        while (high - low > diff) {

            double mid = low + (high - low) / 2.0;

            if (required(stations, mid) > k) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return high;
    }
}