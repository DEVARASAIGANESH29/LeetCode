class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int []count = new int[128];
        int window = 0;
        for(int right = 0; right < s.length(); right++){
            int index = s.charAt(right);
            count[index] ++;
            while(count[index] > 1){
                int countIndex = s.charAt(left);
                count[countIndex] --;
                left++;
            }
            window = Math.max(window, (right-left)+1);
        }
        return window;
    }
}