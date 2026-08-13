class Solution {
    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public String reversePrefix(String word, char ch) {
       char[] chars = word.toCharArray();
        int current = -1;
        for(int right=0; right<word.length();right++){
            if(word.charAt(right) == ch){
                current = right;
                break;
            }
        }
        if(current == -1){
            return word;
        }
        int left = 0;
        while(left < current){
           swap(chars, left, current);
            left++;
            current--;

        }
        return new String(chars);

        
    }
}