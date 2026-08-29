class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer , Integer> map =new HashMap();
        map.put(0,1);
        int sum=0;
        int cnt=0;
        for(int n : nums){
            sum+=n;
            if(map.containsKey(sum-goal)==true)
                cnt+=map.get(sum-goal);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}