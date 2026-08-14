class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> seen = new HashSet<>();
        for(int i : nums){
            seen.add(i);
        }
        int triple = 0;
        for(int num : nums){
            if(seen.contains(num - diff) && seen.contains(num - 2*diff)){
                triple++;
            }
        }
        return triple;
    }
}