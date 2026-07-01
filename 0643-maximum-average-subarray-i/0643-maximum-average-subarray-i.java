class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        int start = 1, end = k;
        double Maxavg = (double) sum /k;
        while(end < n){
            sum = sum - nums[start-1] + nums[end];
            double avg = (double) sum /k;
            Maxavg = Math.max(avg,Maxavg);
            start++;
            end++;
        }
        return Maxavg;
    }
}