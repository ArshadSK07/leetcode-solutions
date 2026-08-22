class Solution {
    public boolean checkDivisibility(int n) {
        long sum=0;
        long pro=1;
        int temp=n;
        while(temp!=0){
            int d=temp%10;
            sum+=d;
            pro*=d;
            temp/=10;
        }
        return (long)n % (sum+pro)==0;

    }
}