class Solution {
    public int minimumRecolors(String blocks, int k) {
        int howManyWhites = 0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W'){
                howManyWhites++;
            }
        }
        int minWhites = howManyWhites;
        int start = 1;
        int end = k;
        while(end < blocks.length()){
            if(blocks.charAt(start -1) == 'W'){
                howManyWhites -= 1;
            }
            if(blocks.charAt(end) == 'W'){
                howManyWhites += 1;
            }
            start++;
            end++;
            minWhites = Math.min(minWhites,howManyWhites);
        }
        return minWhites;
    }
}