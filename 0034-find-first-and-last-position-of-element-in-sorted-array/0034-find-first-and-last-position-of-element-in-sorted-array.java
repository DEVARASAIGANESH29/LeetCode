class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int [] temp = new int[]{-1,-1};
        if(n == 0){
            return temp;
        }
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                temp[0] = i;
                break;
            }
        }
        if(temp[0] == -1) return temp;

        for(int i=n-1;i>=0;i--){
            if(nums[i] == target){
                temp[1] = i;
                break;
            }
        }
        return temp;
    }
}
