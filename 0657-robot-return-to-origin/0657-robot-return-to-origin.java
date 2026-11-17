class Solution {
    public boolean judgeCircle(String moves) {
        char [] stack = new char[moves.length()];
        int top=-1;
        for(char c : moves.toCharArray()){
            if(top==-1){
                stack[++top]=c;
            }
            else if((stack[top]=='L' && c=='R') || stack[top]=='R' && c=='L')
                top--;
            else if((stack[top]=='U' && c== 'D') || (stack[top]=='D' && c=='U'))
                top--;
            else 
                stack[++top]=c;
                
        }
        return top==-1;
    }
}