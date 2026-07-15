class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int length = 0;
        int maxLength = 0;
        int basketOne = -1;
        int basketTwo = -1;
        for(int right = 0;right<fruits.length;right++){
           if(basketOne == -1){
            basketOne = fruits[right];
           }
           if(basketTwo == -1 && basketOne != fruits[right]){
            basketTwo = fruits[right];
           }
           if(basketOne != fruits[right] && basketTwo != fruits[right]){
            int prev = right-1;
            while(fruits[prev] == fruits[prev-1]){
                prev--;
            }
            left = prev;
            basketOne = fruits[left];
            basketTwo = fruits[right];
           }
            length = right-left+1;
            maxLength = Math.max(length,maxLength);
        }
        return maxLength;
    }
}