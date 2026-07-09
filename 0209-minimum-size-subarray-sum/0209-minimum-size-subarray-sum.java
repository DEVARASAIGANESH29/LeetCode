class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int n = nums.length;
        int index = 0;
        int Minlength = Integer.MAX_VALUE;
        int length = 0;
        int sum = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                length = right - left+1;
                Minlength = Math.min(length, Minlength);
                sum = sum - nums[left];
                left++;
             }
        }
        if (Minlength == Integer.MAX_VALUE) {
            return 0;
        } 
        else {
            return Minlength;
        }
        
    }
}