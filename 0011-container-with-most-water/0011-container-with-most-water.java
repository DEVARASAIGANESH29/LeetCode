class Solution {
    public int maxArea(int[] height) {
        int max_element = 0;
        int max_area = 0;
        int distance = 0;
        int area = 0;
        int a = 0;
        int b =height.length-1;
        while(a < b){
           if(height[a] > height[b]){
            distance = b - a;
            area = distance * height[b];
            b--;
           }
           else{
            distance = b - a;
            area = distance * height[a];
            a++;
           }
           if(max_area < area){
            max_area = area;
           }
        }
        return max_area;
    }
}