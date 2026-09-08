class Solution {
    public int maxProduct(int[] nums) {
        int presum=1;
        int suffsum=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(presum==0) presum=1;
            if(suffsum==0) suffsum=1;
            presum*=nums[i];
            suffsum*=nums[nums.length-i-1];
            ans=Math.max(ans,Math.max(presum,suffsum));
        }
        return ans;
    }
}