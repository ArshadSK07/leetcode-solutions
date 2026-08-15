class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int [] ans = new int[n];
        for(int [] arr : bookings){
            int low=arr[0];
            int high=arr[1];
            int seat=arr[2];
            for(int i=low-1;i<high;i++){
                ans[i]+=seat;
            }
        }
        return ans;
    }
}