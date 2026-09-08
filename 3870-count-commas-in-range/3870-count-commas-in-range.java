class Solution {
    public int countCommas(int n) {
        // int count=0;
        // int pow=1000;
        if(n<1000) return 0;
        int ans=(n%1000)+1;
        if(n/1000>1){
            // if n=2019
            int d=n/1000; // d=2;
            d=d*1000; // 2000
            d-=1000; // 1000;
            ans+=d;  // 1000+20;
        }
        return ans;
    }
}