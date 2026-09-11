class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int sum=0;
        for(int i=0;i<n-2;i++){
            if(nums[i]==0){
                nums[i]= nums[i]==0?1:0;
                nums[i+1]=nums[i+1]==0?1:0;
                nums[i+2]=nums[i+2]==0?1:0;
                cnt++;
            }
           
            sum+=nums[i];
        }
        sum+=nums[n-1];
        sum+=nums[n-2];
        if(sum==n) return cnt;
        return -1;
        // for(int ele : nums)
        //     if(ele==0) return -1;
        // return cnt;
    }
}