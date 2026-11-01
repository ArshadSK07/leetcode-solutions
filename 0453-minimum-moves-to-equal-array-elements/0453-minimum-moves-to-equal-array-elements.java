class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        // int max=Integer.MIN_VALUE;  
        for(int n: nums){
            if(n<min) min=n;
            
        }
        int moves=0;
        for(int n:nums)
            moves+=n-min;

        return moves;
    }
}