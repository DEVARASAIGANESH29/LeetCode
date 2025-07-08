class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j]){
                    count ++;
                }
            }
            if(count >= n/3 && !l.contains(nums[i])){
                l.add(nums[i]);
            }
        }
        return l;
    }
}