class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int l=0;
        int r=0;
        int minlen=Integer.MAX_VALUE;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>=target){
                minlen=Math.min(minlen,r-l+1);
                sum-=nums[l++];
            }
            r++;
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}