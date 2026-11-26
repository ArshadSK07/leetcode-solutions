class Solution {
    public boolean canAliceWin(int n) {
        boolean alice=true;
        int rem=10;
        while(n>=rem){
            n-=rem;
            rem--;
            alice = !alice;
        }
        return !alice;
    }
}