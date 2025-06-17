class Solution {
    public int reverseDegree(String s) {
        int n [] = new int[s.length()];
        int p =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            n[i] = (int) 26 - (ch - 'a');
        }
        for(int i=0;i<s.length();i++){
            p = p+n[i]*(i+1);
        }
        return p;
    }
}
