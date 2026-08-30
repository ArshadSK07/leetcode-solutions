class Solution {
    public int minimumDeletions(int[] nums) {
        int n =nums.length;
        int min=Integer.MAX_VALUE;
        int minidx=-1;
        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxidx=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minidx=i;
            }
        }
        // if(minidx <=n/2 && maxidx<=n/2)
        //     return Math.max(minidx,maxidx)+1;
        // if(minidx>n/2 && maxidx >n/2)
        //     return n-Math.min(minidx,maxidx);
        // return Math.min(minidx+1,n-minidx) + Math.min(maxidx+1,n-maxidx);
        // int left=Math.max(minidx,maxidx)+1;
        // int right =n-Math.min(minidx,maxidx);
        // int mixed=Math.min(minidx+1,n-minidx) + Math.min(maxidx+1,n-maxidx);
        // return Math.min(left,Math.min(right,mixed));
        int left = Math.max(minidx, maxidx) + 1;
        int right = n - Math.min(minidx, maxidx); 
        int mixed = Math.min(minidx + 1, n - minidx) + Math.min(maxidx + 1, n - maxidx);

        return Math.min(left, Math.min(right, mixed));
       
    }
}