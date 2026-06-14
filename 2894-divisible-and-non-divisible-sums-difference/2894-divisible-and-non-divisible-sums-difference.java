class Solution {
    public int differenceOfSums(int n, int m) {
        int non_divisble_sum = 0;
        int divisble_sum = 0;
        int result = 0;
        for(int i = 1;i<=n;i++){
            if(i % m == 0){
                divisble_sum += i;
            }
            else{
                non_divisble_sum += i;
            }
        }
        result = non_divisble_sum -  divisble_sum;
        return result;

    }
}