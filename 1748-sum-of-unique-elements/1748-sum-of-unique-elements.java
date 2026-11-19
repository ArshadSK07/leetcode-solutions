class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Step 1: Count occurrences of each number
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Sum numbers that appear exactly once
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        
        return sum;
    }
}