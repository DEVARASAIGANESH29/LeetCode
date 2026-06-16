class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n+1];
        for(int i = 0; i < n;i++){
            if(seen[nums[i]]){
                return nums[i];
            }
            seen[nums[i]] = true;
        }
        return -1;
    }
}