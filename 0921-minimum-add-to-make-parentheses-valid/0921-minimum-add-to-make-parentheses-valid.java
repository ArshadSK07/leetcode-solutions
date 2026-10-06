class Solution {
    public int minAddToMakeValid(String s) {
        char [] stack = new char[s.length()];
        int top=-1;
        for(char c:s.toCharArray()){
            if(c=='(') stack[++top]=c;
            else{
                if(top>-1 && stack[top]=='(' && c==')'){
                    top--;
                }else{
                    stack[++top]=c;
                }
            }
        }
        return top+1;
    }
}