bool isPalindrome(int x) {
    if(x<0)
        return false;
    int temp=x;
    int rev=0;
    while(temp!=0)
    {
        if(rev >INT_MAX/10 ||(rev==INT_MAX && (temp%10)>7) )
            return false;
        if(rev < INT_MIN/10 || (rev==INT_MIN && (temp%10)<-8) )
            return false;
        rev=rev*10+(temp%10);
        
        
        temp/=10;
    }
    return rev==x?true:false;
}