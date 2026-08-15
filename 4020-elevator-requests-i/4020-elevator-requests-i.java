class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans=Math.abs(requests[0]-0);
        for(int i=1;i<requests.length;i++){
            // int d=Math.abs(requests[i]-requests[i-1]);
                ans+=Math.abs(requests[i]-requests[i-1]);
        }
        return ans;
    }
}