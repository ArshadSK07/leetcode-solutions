class Solution {
    public boolean isValid(String str) {
        int n=str.length();
        char [] s=str.toCharArray();
    char [] stack = new char [n];
    int top=-1;
    for(int i=0;i<n;i++)
    {
        if(s[i]=='(' || s[i]=='{' || s[i]=='[')
        {
            stack[++top]=s[i];
        }
        else
        {
            if(top==-1) return false;
            char open=stack[top--];
            if((open == '(' && s[i] != ')') ||
                (open == '[' && s[i] != ']') ||
                (open == '{' && s[i] != '}')){
                    return false;
                }
        }
    }
    if(top==-1)
        return true;
    return false;
    }
}