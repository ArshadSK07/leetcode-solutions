class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int m=k;
        int i=2;
        for(int n : nums){
            if(n<m)
                continue;
            else if(n==m){
                m=k*i;
                i++;
            }   
            else
                return m; 
        }
        return m;
    }
}