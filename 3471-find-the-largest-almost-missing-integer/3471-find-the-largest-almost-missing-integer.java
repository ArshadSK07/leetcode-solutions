class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap();
        int n=nums.length;
        if (n == k) {
            int max = -1;

            for (int ele : nums) {
                max = Math.max(max, ele);
            }

            return max;
        }
        
        for(int i=0;i<=n-k;i++){
            for(int j=0;j<k;j++){
                map.put(nums[i+j],map.getOrDefault(nums[i+j],0)+1);
            }
        }
        int max = -1;

        for (int ele : nums) {
            if (map.get(ele) == 1 && max < ele) {
                max = ele;
            }
        }

        return max;
    }
}