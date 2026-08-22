class Solution {
    public int[] diStringMatch(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int[] ans = new int[n+1];
        int low = 0;
        int high = n;
        for(int i = 0;i<n;i++){
            if(ch[i] == 'I'){
                ans[i] = low;
                low++;
            }
            else if(ch[i] == 'D'){
                ans[i] = high;
                high--;
            }
        }
        ans[n] = low;
        return ans;
        
    }
}