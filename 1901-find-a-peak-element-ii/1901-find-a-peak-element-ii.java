class Solution {
    public int getMaxRow(int[][] mat , int n ,int m,int col){
        int max=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col] > max){
                max=mat[i][col];
                idx=i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        int [] ans=new int [2];
        ans[0]=-1;
        ans[1]=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=getMaxRow(mat,n,m,mid);
            int left=mid>0?mat[row][mid-1]:-1;
            int right=mid+1<m?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]> right){
                ans[0]=row;
                ans[1]=mid;
                return ans;
            }else if(mat[row][mid]<left) high=mid-1;
            else low=mid+1;
        }
        return ans;
    }
}