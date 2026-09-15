class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char [] carr=new char [26];
        for(char c:magazine.toCharArray())
            carr[c-'a']++;
        for(char c:ransomNote.toCharArray()){
            if(carr[c-'a']==0  )
                return false;
            carr[c-'a']--;
        }
        return true;
    }
}