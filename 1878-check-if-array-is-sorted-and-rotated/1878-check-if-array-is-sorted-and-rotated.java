class Solution {
    public boolean check(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        if (nums.equals(temp)) {
            return true;
        } else {
            int key = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    key = i + 1;
                    break;
                }
            }
            int[] temp2 = new int[nums.length];
            int a = 0;
            for (int j = key; j < nums.length; j++) {
                temp2[a++] = nums[j];
            }
            for (int k = 0; k < key; k++) {
                temp2[a++] = nums[k];
            }
            for (int i = 0; i < nums.length; i++) {
                if (temp2[i] != temp[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}


