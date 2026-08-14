class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int idx2=n/2;
        int idx1=idx2-1;
        int ele1=-1,ele2=-1;
        int i=0;
        int j=0;
        int cnt=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                if(cnt==idx1) ele1=nums1[i];
                if(cnt==idx2) ele2=nums1[i];
                i++;
                cnt++;
            }
            else{
                if(cnt==idx1) ele1=nums2[j];
                if(cnt==idx2) ele2=nums2[j];
                j++;
                cnt++;
            }
        }
        while(i<n1){
            if(cnt==idx1) ele1=nums1[i];
            if(cnt==idx2) ele2=nums1[i];
            i++;
            cnt++;
        }
        while(j<n2){
            if(cnt==idx1) ele1=nums2[j];
            if(cnt==idx2) ele2=nums2[j];
            j++;
            cnt++;
        }
        if(n%2==1) return (double)ele2;
        return (double)(ele1+ele2)/2.0;

    }
}