class Solution {
    public void func(int idx, ArrayList<Integer> list, List<List<Integer>> ans,int [] nums, int n){
        if(idx==n){
            ans.add(new ArrayList<>(list)); 
            // ans.add(list);
            return;
        }
        list.add(nums[idx]);
        func(idx+1,list,ans,nums,n);
        list.remove(list.get(list.size()-1));
        func(idx+1,list,ans,nums,n);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        ArrayList<Integer> list = new ArrayList();
        func(0,list,ans,nums,nums.length);
        // index which element either to add or remove, list to store temporary list , ans to store finally generated list , nums = elements array , n= sizeof array
        return ans;
    }
}