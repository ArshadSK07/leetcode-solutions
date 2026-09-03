class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalchalk=0;
        for(int x:chalk) totalchalk+=x;
        long rem=k%totalchalk;
        if(k==0) return 0;
        for(int i=0;i<chalk.length;i++){
            if(rem<chalk[i]) return i;
            rem-=chalk[i];
        }
        return 0;
    }
}