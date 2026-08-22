class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int pro = 1;
        while(n > 0){
            int last_digi = n % 10;
            sum += last_digi;
            pro *= last_digi;
            n = n /10;
        }
        int total = sum+pro;
        return (temp % total == 0);
    }
}