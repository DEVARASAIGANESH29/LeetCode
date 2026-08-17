class Solution {
    public void check(char[]ch){
        int start = 0;
        int end = ch.length-1;
        while(start < end){
            if(ch[start] != ch[end]){
                if(ch[start] < ch[end]){
                    ch[end] = ch[start];
                }
                else{
                    ch[start] = ch[end];
                }
            }
            start++;
            end--;
        }
    }
    public String makeSmallestPalindrome(String s) {
        char[] ch = s.toCharArray();
        check(ch);
        return new String(ch);
    }
}