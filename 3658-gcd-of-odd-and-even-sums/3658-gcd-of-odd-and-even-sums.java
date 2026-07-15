class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddCount = 0;
        int evenCount = 0;
        for(int i=0;i <= n*2;i++){
            if(i%2 == 0){
                evenCount += i;
            }
            else{
                oddCount += i;
            }
        }
        while(evenCount != 0){
            int temp = evenCount;
            evenCount = oddCount % evenCount;
            oddCount = temp;
        }
        return oddCount;
        
    }
}