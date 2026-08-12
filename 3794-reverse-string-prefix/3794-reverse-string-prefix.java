class Solution {
    public String reversePrefix(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < k / 2; i++) {
            swap(chars, i, k - i - 1);
        }   
        return new String(chars);
    }
    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
