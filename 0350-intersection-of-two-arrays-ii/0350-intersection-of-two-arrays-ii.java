class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> li=new ArrayList();
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                li.add(nums1[i]);
                int temp=nums1[i];
                // while(i<n1 && nums1[i]==temp)  i++;
                // while(j<n2 && nums2[j]==temp)  j++;
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        int[] ans=new int [li.size()];
        for(int k=0;k<ans.length;k++){
            ans[k]=li.get(k);
        }
        return ans;
    }
}