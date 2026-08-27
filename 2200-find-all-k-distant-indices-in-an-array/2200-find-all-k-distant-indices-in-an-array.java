import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int start = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {

                int leftBound = Math.max(start, i - k);
                int rightBound = Math.min(i + k, n - 1);
                

                while (leftBound <= rightBound) {
                    result.add(leftBound);
                    leftBound++;
                }
                
                start = leftBound; 
            }
        }
        return result;
    }
}
