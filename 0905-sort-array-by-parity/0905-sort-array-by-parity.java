class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length;
        while(j<n){
            while(j<n && nums[j]%2==1)
                j++;
            if(i<n && j<n){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            i++;
            j++;
        }
        return nums;
    }
}