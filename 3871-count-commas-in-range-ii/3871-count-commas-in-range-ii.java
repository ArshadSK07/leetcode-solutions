class Solution {
    public long countCommas(long n) {
       long ans=0;
       long a=1000;
       while(n>=a){
        ans+=n-a+1;
        a*=1000;
       }
       return ans;
    }
}