class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> li1 =new ArrayList();
        ArrayList<Integer> li2 =new ArrayList();
        li1.add(nums[0]);
        li2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(li1.get(li1.size()-1) > li2.get(li2.size()-1))
                li1.add(nums[i]);
            else 
                li2.add(nums[i]);
        }
        int [] ans =new int [li1.size()+li2.size()];
        int idx=0;
        for(int n : li1){
            ans[idx++]=n;
        }
        for(int n :li2){
            ans[idx++]=n;
        }
        return ans;
    }
}