class Solution {
    public int singleNumber(int[] nums) {
        // int n = nums.length;
        // int temp=0;
        // int cnt = 0;
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(nums[i] == nums[j]){
        //             cnt++;
        //         }
        //        else{
        //          cnt =0;
        //        }
        //     }
        //     if(cnt == 0){
        //       temp = nums[i];
        //     }
        //  }
        //   return temp;
           

        int n = nums.length;
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            result ^= nums[i];
        }
        
        return result;

        }
}