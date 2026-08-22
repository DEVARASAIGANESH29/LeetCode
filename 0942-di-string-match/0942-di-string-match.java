class Solution {
    public int[] diStringMatch(String s) {
        int perm [] = new int[s.length()+1];
        int d = s.length();
        int low = 0;
        int j = 0;
        int index = 0;
        while(index < s.length()){
            if(s.charAt(index) == 'D'){
                perm[j] = d;
                d--;
                j++;
            }
            else if(s.charAt(index) == 'I'){
                perm[j] = low;
                j++;
                low++;
            }
            index++;
        }
        perm[j] = low;
        return perm;
    }
}