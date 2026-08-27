class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int left = 0;
        int right = nums.length-1;
        int [] count = new int[nums.length];
        int index = 0;
        List<Integer> result = new ArrayList<>();
        while(left < nums.length){
            if(nums[left] == key ){
                count[index++] = left;
            }
            left++;
        }
        for(int i = 0;i<nums.length;i++){
            for(int j =0; j<index;j++){
                if(Math.abs(i - count[j]) <= k){
                    result.add(i);
                    break;
                }
            }

        }
        return result;
    }
}