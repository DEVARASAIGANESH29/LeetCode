class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxx = nums[0];
        int Max = nums[0];
        for (int i = 1; i < n; i++) {
            Max = Math.max(nums[i], Max + nums[i]);
            maxx = Math.max(maxx, Max);
        }

        return maxx;
    }
 }