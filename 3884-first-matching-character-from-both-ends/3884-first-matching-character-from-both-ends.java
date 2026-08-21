class Solution {
    public int firstMatchingIndex(String s) {
        int minIndex = Integer.MAX_VALUE;
        int index = 0;
        int n = s.length();
        while(index <= n/2){
            if(s.charAt(index) == s.charAt(n - index - 1)){
                minIndex = Math.min(minIndex, index);
            }
            index++;
        }
        if(minIndex == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return minIndex;
        }
        
    }
}