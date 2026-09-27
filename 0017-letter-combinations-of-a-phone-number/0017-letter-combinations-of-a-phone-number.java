class Solution {
    public static void func(int idx, String str,String digits,List<String> ans, String[] combo){
        if(idx==digits.length()){
            ans.add(str);
            return;
        }
        int number=digits.charAt(idx)-'0';
        for(int i=0;i<combo[number].length();i++){
            func(idx+1,str+combo[number].charAt(i),digits,ans,combo);
        }
        return;
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList();
        String[] combo={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        func(0,"",digits , ans, combo);
        return ans;
    }
}