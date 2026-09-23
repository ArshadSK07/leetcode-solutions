class Solution {
    public int sumofdigit(int n){
        int sum=0;
        while(n>0){
            sum+=((n%10)*(n%10));
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        if(n==1 || n==7  ) return true;
        int temp=n;
        Set<Integer> set= new HashSet();
        while(n>1){
            n=sumofdigit(n);
            if(set.contains(n)) return false;
            else set.add(n);
        }
        return n==1;
    }
}