class Solution {
    public int alternateDigitSum(int n) {
        int len=(int)Math.log10(n)+1;
        int pow=(int)Math.pow(10,len-1);
        int sum=0;
        int sign=1;
        while(n>0){
            sum=sum+sign*(n/pow);
            n%=pow;
            pow/=10;
            sign=sign==1?-1:1;
        }
        return sum;
    }
}