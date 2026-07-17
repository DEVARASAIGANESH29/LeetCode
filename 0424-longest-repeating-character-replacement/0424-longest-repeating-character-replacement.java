class Solution {
    public int highest(int nums[]){
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
        int left = 0, wl = 0;
        int [] count = new int[26];
        int max = 0;
        for(int right = 0;right < s.length();right++){
            count[s.charAt(right) - 'A']++;
            int curfreq =  count[s.charAt(right) - 'A'];
            max = Math.max(max,curfreq);
            while((right-left+1) - max > k){
                count[s.charAt(left) - 'A']--;
                left++;
                max = highest(count);
            }
            wl = Math.max(wl,right-left+1);
        }
        return wl;
    }
}