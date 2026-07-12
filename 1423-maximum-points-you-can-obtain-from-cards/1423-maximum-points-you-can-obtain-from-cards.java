class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int left = n - k;
        int right = 0;
        int max = 0;
        int sum =0;
        for(int i = left; i < n;i++){
            sum += cardPoints[i];
        }
        max = sum;
        while(k > 0){
            sum -= cardPoints[left];
            sum += cardPoints[right];
            left++;
            right++;
            k--;
            max = Math.max(max,sum);
        }
        return max;
    }
}