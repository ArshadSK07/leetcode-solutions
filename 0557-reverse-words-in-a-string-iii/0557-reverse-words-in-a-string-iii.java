class Solution {
    public void reverse (char [] arr , int i, int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        char [] arr = s.toCharArray();
        int n=arr.length;
        int i=0,j=0;
        while(j<n){
            while (i < n && arr[i] == ' ') i++;
            j = i;
            while (j < n && arr[j] != ' ') j++;
            reverse(arr, i, j - 1);
            i = j;
        }
        return String.valueOf(arr).replaceAll("\\s+", " ");
    }
}