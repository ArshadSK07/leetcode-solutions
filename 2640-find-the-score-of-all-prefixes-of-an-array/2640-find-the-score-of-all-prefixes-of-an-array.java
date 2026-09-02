class Solution {
    public long[] findPrefixScore(int[] nums) {
        int max=0;
        long [] ans = new long[nums.length];
        long presum=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            presum+=max+nums[i];
            ans[i]=presum;
            
        }
        return ans;
    }
}