class Solution {
    public StringBuilder deimaltobinary(char c){
        // StringBuilder sb= new StringBuilder();
        // while(c!=0){
        //     sb.append(String.valueOf(c%2));
        //     c/=2;
        // }
        // return sb.reverse();
        StringBuilder sb = new StringBuilder();
                while (c != 0) {
            sb.append(c % 2); 
            c /= 2;
        }
        while (sb.length() < 8) {
            sb.append('0');
        }
        
        return sb.reverse();
    }
    public boolean isPalindromic(String s) {
        char [] str = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c:str){
            sb.append(deimaltobinary(c));
        }
        String totalBits = sb.toString();
        String reversedBits = sb.reverse().toString();
        return totalBits.equals(reversedBits);
        
    }
}