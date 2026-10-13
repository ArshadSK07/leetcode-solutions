class Solution {
    static int bs(int [] arr,int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]< x) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = new int[nums.length];
        
        int n=nums.length;
        for(int i=0;i<n;i++)
            temp[i]=nums[i];
        int res[] = new int[n];
        Arrays.sort(temp);
        for(int i=0;i<n;i++){
            res[i]=bs(temp,nums[i]);
        }
        return res;
         
    }
}