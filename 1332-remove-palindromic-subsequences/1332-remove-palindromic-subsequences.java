class Solution {
    public boolean check(char[] ch){
        int left = 0;
        int right = ch.length -1;
        while(left < right){
            if(ch[left] == ch[right]){
                right--;
                left++;
            }
            else{
                return false;
            }
        }
        return true;
    }
  
    public int removePalindromeSub(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int count = 0;
        char [] ch = s.toCharArray();
        check(ch);
        if(check(ch)){
            return 1;
        }

        return 2;
    }
}