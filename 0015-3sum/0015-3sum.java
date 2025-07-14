class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> hash = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int k = - (nums[i] + nums[j]);
                if(hash.contains(k)){
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i],nums[j],k));
                    Collections.sort(temp);
                    st.add(temp);
                }
                hash.add(nums[j]);
            }
        }
        ans.addAll(st);
        return ans;
    }
}