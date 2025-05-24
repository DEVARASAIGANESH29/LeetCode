class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int j = 0;
        int [] temp = new int [n];
        for(int i=0;i<n;i++){
            if(i==0){
                temp[j]= nums[0];
                j++;
            }
            else{
                 temp[j] = nums[i] + temp[j-1];
                 j++;
            }

        }
        return temp;
        
    }
}