class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // FIX 2: Reset freq to 0 for every new starting point i
            int freq = 0; 
            
            for (int j = i; j < nums.length; j++) {
                // If the current element is target, increase our target count
                if (nums[j] == target) {
                    freq += 1;
                }
                
                // Calculate current subarray length
                int l = j - i + 1;
                
                // FIX 1 & 3: Check the majority condition for EVERY subarray, 
                // using the correct variable 'l' (length) instead of '1'
                if (freq * 2 > l) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
