class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int [] ans = new int[seq.length()];
        int cnt=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                cnt++;
                ans[i]=cnt%2;
            }
            else{
                ans[i]=cnt%2;
                cnt--;
            }
        }
        return ans;
    }
}