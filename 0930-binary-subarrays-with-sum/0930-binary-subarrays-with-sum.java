class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0;
        int sum = 0;
        int totalSubarrays = 0; 
        int prefixZeroes = 0; 
        
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (left < right && sum > goal) {
                sum -= nums[left];
                left++;
                prefixZeroes = 0;
            }
            while (left < right && nums[left] == 0 && sum == goal) {
                prefixZeroes++;
                sum -= nums[left];
                left++;
            }
            if (sum == goal) {
                totalSubarrays += (1 + prefixZeroes); 
            }
        }
        
        return totalSubarrays;
    }
}