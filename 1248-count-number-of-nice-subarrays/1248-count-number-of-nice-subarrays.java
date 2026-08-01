class Solution {
    public int atmost(int []nums, int k){
        int odd = 0;
        int left = 0,count = 0;
        for(int right = 0; right<nums.length;right++){
            odd += nums[right]%2 == 1?1:0;
            while(odd>k){
                odd -= nums[left]%2 == 1?1:0;
                left++;
        }
            count += right-left+1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
    }
}