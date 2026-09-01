class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer , Integer> map =new HashMap(); // to store frequency of remainder;
        map.put(0,1);
        int cnt=0; // to cnt no of subarrays
        int sum=0;
        for(int ele : nums){
            sum+=ele;
            int rem=sum%k;
            if(rem <0){
                rem+=k;
            }
            cnt+=map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);// to increase frequrncy
        }
        return cnt;
    }
}