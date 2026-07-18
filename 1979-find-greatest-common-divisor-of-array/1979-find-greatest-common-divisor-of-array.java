class Solution {
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public int findGCD(int[] nums) {
        int left = 0;
        int min = nums[0];
        int max = nums[0];
        while(left < nums.length){
            min = Math.min(min, nums[left]);
            max = Math.max(max, nums[left]);
            left++;
        }
        return gcd(max,min);
    }
}