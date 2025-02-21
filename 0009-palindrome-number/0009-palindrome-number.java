class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        int last;
        if(x<0){
            return false;
        }
        while(temp >0){
            last = temp%10;
            rev = (rev*10)+last;
            temp = temp/10;
        }
        return rev == x;
    }
}