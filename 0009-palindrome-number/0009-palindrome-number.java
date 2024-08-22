class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        int div = 0;
        if(x<0){
            return false;
        }
        while(x!=0){
            rev = x%10;
            div = div*10 + rev;
            x = x/10;
        }
        if(div == org){
            return true;
        }
        else{
            return false;
        }
    }
}