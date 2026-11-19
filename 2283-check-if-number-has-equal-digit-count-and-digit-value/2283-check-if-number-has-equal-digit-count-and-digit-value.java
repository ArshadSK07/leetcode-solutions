class Solution {
    public boolean digitCount(String num) {
        int [] cnt = new int [10];
        for(char c:num.toCharArray()){
            cnt[c-'0']++;
        }
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            if(c-'0' != cnt[i]) return false;
        }
        return true;
    }
}