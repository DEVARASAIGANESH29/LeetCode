class Solution {
    public int divisorSubstrings(int num, int k) {
        int tenk = (int)Math.pow(10,k);
        int digits = (int)Math.log10(num)+1;
        int timer = digits-k+1;
        int original = num;
        int count = 0;

        while(timer > 0){
            int div = num%tenk;
            if(div != 0 && original % div == 0){
                count ++;
            }
            num /= 10;
            timer--;
        }
        return count;
    }
}