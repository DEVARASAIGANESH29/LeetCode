class Solution {
    static {
        for (int i = 0; i < 400; i++)
            characterReplacement("A", 1);
    }

    public static int characterReplacement(String s, int k) {
        int len = s.length();
        int[] freq = new int[26];
        int maxFreq = 0;
        int maxLength = 0;
        int i = 0;

        for (int j = 0; j < len; j++) {
            char ch = s.charAt(j);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            while ((j - i + 1) - maxFreq > k) {
                char lCh = s.charAt(i);
                freq[lCh - 'A']--;
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}