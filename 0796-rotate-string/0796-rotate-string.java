class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (goal+goal).contains(s);
        // StringBuilder sb=new StringBuilder();
        // sb.append(goal);
        // sb.append(goal);
        // return sb.contains(s);
    }
}