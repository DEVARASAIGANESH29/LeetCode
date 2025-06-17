class Solution {
    public int scoreOfString(String s) {
        int arr[] = new int [s.length()];
        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
            arr[i] = (int) ch;
        }
        int sum = 0;
        for(int i = 1; i<s.length(); i++){
            sum += Math.abs(arr[i] - arr[i-1]);
        }
        return sum;
    }
}