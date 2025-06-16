class Solution {
    public int scoreOfString(String s) {
        int asci[]=new int[s.length()];
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            asci[i]=(int)ch;
        }
        for(int i=1;i<s.length();i++)
        {
            sum+=Math.abs(asci[i]-asci[i-1]);
        }
        return sum;
    }
}