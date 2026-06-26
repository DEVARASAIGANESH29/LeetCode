class Solution {
    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        int count = 0;
        while(left <= right){
            int mid = left+(right - left)/2;
            long coin_needed = (long)mid *(mid+1)/2;
            if(coin_needed <= n){
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return right;
        
    }
}