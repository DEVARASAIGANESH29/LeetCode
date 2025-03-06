class Solution {
    public int[] shuffle(int[] nums, int n) {
        int s = nums.length;
        int temp[] = new int [s];
        int j =0;
        for(int i=0;i<n;i++){
            temp[j] = nums[i];
            j = j+2;
        }
        int x = 1;
        for(int i =n;i<s;i++){
            temp[x] = nums[i];
            x = x+2;
        }
        return  temp;
    }
}