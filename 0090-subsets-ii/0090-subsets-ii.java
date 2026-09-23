class Solution {
    public void func(int idx, ArrayList<Integer> list, HashSet<ArrayList<Integer>> ans,int [] nums, int n){
        if(idx==n){
            ans.add(new ArrayList<>(list)); 
            // ans.add(list);
            return;
        }
        list.add(nums[idx]);
        func(idx+1,list,ans,nums,n);
        list.remove(list.size()-1);
        func(idx+1,list,ans,nums,n);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> ans = new  HashSet();
        ArrayList<Integer> list= new ArrayList();
        func(0,list,ans,nums,nums.length);
        return new ArrayList<>(ans);
    }
}