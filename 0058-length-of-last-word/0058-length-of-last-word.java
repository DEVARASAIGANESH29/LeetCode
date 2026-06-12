class Solution {
    public int lengthOfLastWord(String s) {
        int a = s.length() - 1;
        int count = 0;

        // Skip trailing spaces
        while (a >= 0 && s.charAt(a) == ' ') {
            a--;
        }

        // Count characters of the last word
        while (a >= 0 && s.charAt(a) != ' ') {
            count++;
            a--;
        }

        return count;
    }
}