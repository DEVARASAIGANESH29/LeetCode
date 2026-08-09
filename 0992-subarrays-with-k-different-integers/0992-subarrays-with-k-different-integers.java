class Solution {
    public int atmostk(int[] nums, int k) {
        int left = 0, count = 0;
        int freq[] = new int[nums.length + 1];
        int dis = 0;
        for(int right = 0;right < nums.length;right++){
            if(freq[nums[right]] == 0){
                dis++;
            }
            freq[nums[right]]++;
            while(dis > k){
                freq[nums[left]]--;
                if(freq[nums[left]] == 0){
                dis--;
            }
            left++;
        }

            count += right-left+1;
        }
        return count;
        
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostk(nums, k) - atmostk(nums, k-1);
    }
}