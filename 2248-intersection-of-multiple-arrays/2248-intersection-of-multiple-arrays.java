class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> result = new ArrayList<>();
        
        int[] count = new int[1001];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                count[nums[i][j]]++;
            }
        }

        for (int k = 1; k <= 1000; k++) {
            if (count[k] == nums.length) {
                result.add(k);
            }
        }
        
        return result;
    }
}
