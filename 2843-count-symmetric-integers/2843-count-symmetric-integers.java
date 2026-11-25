class Solution {
    public int sum(String str){
        int sum=0;
        for(char c : str.toCharArray()){
            sum+=c-'0';
        }
        return sum;
    }
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        for(int i=low ;i<=high;i++){
            String s=Integer.toString(i);
            if( s.length()%2==0&&sum(s.substring(0, s.length() / 2)) == sum(s.substring(s.length() / 2))) 
                cnt++;
        }
        return cnt;
    }
}