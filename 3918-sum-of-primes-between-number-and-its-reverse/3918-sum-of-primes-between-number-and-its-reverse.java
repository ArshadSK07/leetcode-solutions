class Solution {
    public int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
    public static boolean isprime(int n){
        if (n < 2) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    for (int i = 3; i <= n / i; i += 2) {
        if (n % i == 0) return false;
    }
    return true;
    }
    public int sumOfPrimesInRange(int n) {
        int max=reverse(n);
        int sum=0;
        for(int i=Math.min(n,max);i<=Math.max(n,max);i++){
            if( isprime(i)){
                sum+=i;
            }
        }
        return sum;
    }
}