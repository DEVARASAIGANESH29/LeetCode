class Solution {
    public boolean check(char[] ch){
        int left = 0;
        int right = ch.length -1;
        while(left < right){
            if(ch[left] == ch[right]){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;

    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length; i++){
            char [] ch = words[i].toCharArray();
            if(check(ch) == true){
                return words[i];
            }
        }
        return "";
    }
}