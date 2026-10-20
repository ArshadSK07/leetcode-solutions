class Solution {
    public double findMaxAverage(int[] nums, int k) {
     double sum=0;
     double maxavg=0;
     for(int i=0;i<k;i++){
        sum+=nums[i];
     }   
    maxavg=sum/k;
    for(int i=1;i<=nums.length-k;i++){
        sum+=nums[i+k-1];
        sum-=nums[i-1];
        maxavg=Math.max(maxavg,sum/k);
    }
    return maxavg;
    }
}