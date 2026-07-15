class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int count[] = new int[3];
        int cnt = 0;
        int point = 0;
        for(int right = 0; right < s.length();right++){
            int index = s.charAt(right) - 'a';
            count[index]++;
            while(count[point] != 0 && count[point+1] != 0 && count[point+2] != 0){
                cnt += s.length() - right;
                count[s.charAt(left)-'a']--;
                left++;
            }
        } 
        return cnt;
    }
}