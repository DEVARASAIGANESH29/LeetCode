class Solution {
    public int[] decrypt(int[] code, int k) {
        int nums[] = new int[code.length];
        int left = 1,right = k;
        if(k==0){
            return nums;
        }
        if(k<0){
            k= -k;
            left = code.length-k;
            right = code.length-1;
        }
        int sum = 0;
        int index = left;
        for(int i=0;i<k;i++){
            sum += code[index++];
        }
        nums[0] = sum;
        for(int i=1;i<code.length;i++){
            sum = sum-code[(left++)% code.length];
            sum = sum+code[(++right)% code.length];
            nums[i] = sum;

        }
        return nums;
    }
}