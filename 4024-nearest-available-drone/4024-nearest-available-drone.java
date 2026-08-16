class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int maxdist=Integer.MAX_VALUE;
        int minid=-1;
        int tx=target[0];
        int ty=target[1];
        int i=0;
        for(int arr[] : drones){
            int low=arr[0];
            int high=arr[1];
            int dist=Math.abs(low-tx)+Math.abs(high-ty);
            if(dist<= arr[2]){
                if(dist<maxdist){
                    maxdist=dist;
                    minid=i;
                }
            }
            i++;
        }
        return minid;
    }
}