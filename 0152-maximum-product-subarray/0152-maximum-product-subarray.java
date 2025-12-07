class Solution {
public int maxProduct(int[] nums) {
    if (nums == null || nums.length == 0) return 0;

    int maxSoFar = nums[0];   
    int minSoFar = nums[0];   
    int result   = nums[0];   

    for (int i = 1; i < nums.length; i++) {
        int cur = nums[i];

        int candidate1 = maxSoFar * cur;
        int candidate2 = minSoFar * cur;

        maxSoFar = Math.max(cur, Math.max(candidate1, candidate2));
        minSoFar = Math.min(cur, Math.min(candidate1, candidate2));

        result = Math.max(result, maxSoFar);
    }
    return result;
}
}

