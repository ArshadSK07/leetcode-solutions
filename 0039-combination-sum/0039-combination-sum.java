class Solution {
    public static void func(int idx, List<Integer> list ,List<List<Integer>> ans, int [] arr , int target ){
        if(target==0){
            ans.add(new ArrayList(list));
            return;
        }
        if(idx==arr.length || target<0){
            return;
        }
        list.add(arr[idx]);
        func(idx,list,ans,arr,target-arr[idx]);
        list.remove(list.size()-1);
        func(idx+1,list,ans,arr,target);
        return;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> list= new ArrayList();
        func(0,list,ans,candidates,target);
        return ans;
    }
}