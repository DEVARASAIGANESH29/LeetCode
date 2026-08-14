class Solution {
    public double minimumAverage(int[] nums) {
        double minSum = Double.MAX_VALUE;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length -1;
        while(left < right){
           int currentSum = nums[left] + nums[right];
           minSum = Math.min(minSum, currentSum);
            left++;
            right--;
        }
        return minSum / 2.0;
    }
}