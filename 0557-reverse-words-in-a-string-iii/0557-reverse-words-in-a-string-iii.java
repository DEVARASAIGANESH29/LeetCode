class Solution {
    public void swap(char []ch, int start, int end){
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
        
    }
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        
        for(int end = 0; end < s.length(); end++){
            if(ch[end] == ' ' || end == ch.length-1){
                int targetEnd = (end == ch.length - 1) ? end : end - 1;
                swap(ch, start, targetEnd);
                start= end+1;
            }
        }
        return new String(ch);
        
    }
}