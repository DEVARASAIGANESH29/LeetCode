class Solution {
    public double minimumAverage(int[] nums) {
        double min = Double.MAX_VALUE;
        double avg = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            avg = (nums[left] + nums[right])/2.0;
            left++;
            right--;
            min = Math.min(avg , min);
        }
        return min;
    }
}