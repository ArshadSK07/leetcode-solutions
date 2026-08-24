class Solution {
    public int findMaxLength(int[] nums) {
        int preSum=0;
        Map<Integer , Integer> map = new HashMap();
        int maxlen=0;
        map.put(0, -1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                preSum+=-1;
            else
                preSum+=1;
            if(map.containsKey(preSum)){
                maxlen=Math.max(maxlen,i-map.get(preSum));
            }else{
                map.put(preSum,i);
            }
            
        }
        return maxlen;
    }
}