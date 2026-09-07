class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int cnt=0;// to store ans 
        int i=0;
        int n=colors.length;
        while(i<colors.length){
            int left=colors[(i-1+n)%n];
            int cur=colors[i];
            int right=colors[(i+1)%n];
            if(cur!=left && cur!=right)
                cnt++;
            i++;
        }
        return cnt;
    }
}