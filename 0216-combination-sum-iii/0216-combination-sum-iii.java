class Solution {
    public static void func(int sum,List<Integer> list,List<List<Integer>> ans , int k ){
        if(sum==0 && list.size()==k){
            ans.add(new ArrayList(list));
            return;
        }
        if(sum<0 || list.size()>k) return;
        int ele=list.size()==0?1:list.get(list.size()-1)+1;
        for(int i=ele;i<=9;i++){
            if(i<=sum){
                list.add(i);
                func(sum-i,list,ans,k);
                list.remove(list.size()-1);
            }
        }
        return;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> list= new ArrayList();
        func(n,list,ans,k);
        return ans;
    }
}