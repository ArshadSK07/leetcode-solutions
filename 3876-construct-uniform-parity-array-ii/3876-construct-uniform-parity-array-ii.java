class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd=Integer.MAX_VALUE;
        for(int n : nums1){
                minodd=Math.min(minodd,n);
        }
        if(minodd%2==1) return true;
        for(int x : nums1){
            if(x%2==1){
                return false;
            }
        }
        return true;
    }
}