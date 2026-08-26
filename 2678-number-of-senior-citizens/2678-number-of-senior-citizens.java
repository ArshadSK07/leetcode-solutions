class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(String str : details){
            int age=str.charAt(11)-'0';
            age=age*10;
            age+=str.charAt(12)-'0';
            if(age> 60)
                cnt++;
        }
        return cnt;
    }
}