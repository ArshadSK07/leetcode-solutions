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
        func(idx+1,list,ans,arr,target-arr[idx]);// taking 
        list.remove(list.size()-1);
        int next = idx + 1;
        while (next < arr.length && arr[next] == arr[idx]) {
            next++;// skipping duplicates 
        }
        func(next,list,ans,arr,target); // not taking
        
        return;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList();
        List<Integer> list= new ArrayList();
        func(0,list,ans,candidates,target);
        return ans;
    }
}