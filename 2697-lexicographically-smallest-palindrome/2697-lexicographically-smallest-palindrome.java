class Solution {
    public void check(char[]ch){
        int start = 0;
        int end = ch.length-1;
        while(start < end){
            char minChar = (char) Math.min(ch[start], ch[end]);
            ch[start] = minChar;
            ch[end] = minChar;
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