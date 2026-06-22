class Solution {
    public int maxOperations(int[] nums, int k) {
        int a = 0;
        int count = 0;
        int b = nums.length - 1;
        Arrays.sort(nums);
        while(a < b){
            int sum = nums[a] + nums[b];
            if(sum == k){
                count++;
                a++;
                b--;
            }
            else if(sum < k){
                a++;
            }
            else{
                b--;
            }
        }
        return count;
    }
}