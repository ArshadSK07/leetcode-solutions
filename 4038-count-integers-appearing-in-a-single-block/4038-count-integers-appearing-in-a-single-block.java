class Solution {
    public int countSpecialIntegers(int[] nums) {
        int ans=0;
        int i=0;
        int [] block = new int[101];
        int n=nums.length;
        if(n==1) return 1;
        while(i<n){
            int j=i+1;
            while(j<n && nums[i]==nums[j])
                j++;
            block[nums[i]]++;
            i=j;
        }
        for(int k=0;k<101;k++)
            if(block[k]==1)
                 ans++;
        return ans;
    }
}