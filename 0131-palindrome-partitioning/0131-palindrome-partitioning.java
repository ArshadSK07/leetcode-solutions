class Solution {
    public static boolean checkpalin(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void func(int idx,List<String> list, List<List<String>> ans,String s){
        if(idx==s.length()) {
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(checkpalin(s,idx,i)==true){
                list.add(s.substring(idx,i+1));
                func(i+1,list,ans,s);
                list.remove(list.size()-1);
            }
        }
        return;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList();
        List<String> list = new ArrayList();
        func(0,list,ans,s);
        return ans;
    }
}