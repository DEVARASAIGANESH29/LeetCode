class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int result = 0;
        for(int i = 0;i<nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
        }
        for (int key : count.keySet()) {
            if (count.get(key) > 1) {
                return key;
            }
        }
        return -1;        
    }
}