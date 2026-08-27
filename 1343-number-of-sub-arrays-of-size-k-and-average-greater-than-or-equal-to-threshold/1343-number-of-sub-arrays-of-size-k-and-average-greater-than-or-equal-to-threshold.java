class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt=0;
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++)
            sum+=arr[i];
        if(sum/k>=threshold)  cnt++;
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            if(sum/k>=threshold) cnt++;
        }
        return cnt;
    }
    // int sum=0;
        // for(int i=0;i<k;i++){
        //     sum+=arr[i];
        // }
        // if(sum/k>=threshold)
        //     cnt++;
        // for(int i=0;i<=n-k;i++){
        //     int sum=0;
        //     for(int j=i;j<i+k;j++)
        //         sum+=arr[j];
        //     if(sum/k >= threshold)
        //         cnt++;
        // }
}