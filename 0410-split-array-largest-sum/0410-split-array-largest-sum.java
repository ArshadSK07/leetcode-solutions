class Solution {
    public boolean ispossible(int [] arr , long barrier , int k){
        int alloatedstu=1;
        int pages=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>barrier) return false;
            if(pages+arr[i]>barrier){
                alloatedstu++;
                pages=arr[i];
            }else{
                pages+=arr[i];
            }
        }
        if(alloatedstu>k) return false;
        return true;
    }
    public int splitArray(int[] nums, int k) {
        // Arrays.sort(nums);
        long low=0;
        long high=0;
        long res=-1;
        for(int n: nums){
            low=Math.max(low,n);
            high+=n;
        } 
        while(low<=high){
            long mid = low+(high-low)/2;
            if(ispossible(nums,mid,k)==true){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }       
        return (int)res;
    }
}