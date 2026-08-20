class Solution {
    public void distribute(int [] nums, int [] arr1, int [] arr2){
        int index = 2;
        int i = 0;
        int j = 0;
        arr1[i] = nums[0];
        arr2[j] = nums[1];
        i++;
        j++;
        while(index < nums.length){
            if(arr1[i-1] > arr2[j-1]){
                arr1[i] = nums[index];
                i++;
            }
            else if(arr1[i-1] < arr2[j-1]){
                arr2[j] = nums[index];
                j++;
            }
            index++;
        }
    }
    public int[] resultArray(int[] nums) {
        int [] arr1 = new int[nums.length];
        int [] arr2 = new int[nums.length];
        distribute(nums, arr1,arr2);
        int ind = 0;
        int [] result = new int[nums.length];
        for(int i = 0; i< arr1.length;i++){
            if(arr1[i] != 0){
                result[ind++] = arr1[i];
            }
        }
        for(int j = 0; j< arr2.length;j++){
            if(arr2[j] != 0){
                result[ind++] = arr2[j];
            }
        }
        return result;

    }
}