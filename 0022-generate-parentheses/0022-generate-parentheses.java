class Solution {
    public void fun(String s,int open, int close,List<String> ans , int n ){
        if(open > n) return;
        if(open == close && open+close==2*n){
            ans.add(s);
            return;
        }
        fun(s+"(",open+1,close,ans,n);
        if(open>close)
            fun(s+")",open,close+1,ans,n);
        return;
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        fun("",0,0,ans,n);
        return ans;
    }
}