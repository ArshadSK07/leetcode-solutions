class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int ele : nums) total+=ele;
        int ls=0,rs=0;
        for(int i=0;i<n;i++){
            rs=total-nums[i]-ls;
            if(rs==ls) return i;
            ls+=nums[i];
        }
        return -1;
    }
}