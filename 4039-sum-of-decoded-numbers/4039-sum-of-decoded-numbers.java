class Solution {
    public int len(long n){
        return (int)Math.log10(n)+1;
    }
    public long power(long x,long y,long mod){
        long res=1;
        while(y>0){
            if(y%2==1)
                res=(res*x)%mod;
            x=x*x%mod;
            y/=2;
        }
        return res;
    }
    public int sumDecoded(long[] nums) {
        long ans=0;
        long mod=1000000007l;
        for(long ele : nums){
            long width=ele%10;
            long d=ele/10;
            long div=(long)Math.pow(10,len(d)-width);
            long x=d/div;
            long y=d%div;
            ans=(ans+power(x,y,mod))%mod;
        }
        return (int)ans;
    }
}