class Solution {
    public long add(long a , long b){
        int lenb=(int)Math.log10(b)+1;
        return a*(long)Math.pow(10,lenb)+b;
    }
    public long findTheArrayConcVal(int[] nums) {
        long sum=0;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(i==j){
                sum+=nums[i];
            }else{
                sum+=add(nums[i],nums[j]);
            }
            i++;
            j--;
        }
        return sum;
    }
}