class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        int index = nums.length-1;
        int a = 0;
        int b = nums.length-1;
        while(a <= b){
            int leftsquare = nums[a] * nums[a];
            int rightsquare = nums[b] * nums[b];

            if(leftsquare < rightsquare){
                result[index] = rightsquare;
                b--;
            }
            else{
                result[index] = leftsquare;
                a++;
            }
            index--;
        }
        return result;
    }
}