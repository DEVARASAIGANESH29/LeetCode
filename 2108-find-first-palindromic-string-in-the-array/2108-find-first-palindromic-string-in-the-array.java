class Solution {
    public boolean check(String word){
        int left = 0;
        int right = word.length() -1;
        while(left < right){
            if(word.charAt(left) == word.charAt(right)){
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
        for (String word : words) {
            if (check(word)) {
                return word;
            }
        }
        return "";
    }
}