class Solution {
    public void swap(int [] image){
        int left=0;
        int right = image.length-1;
        while(left <= right){
             if(left < right){
                int temp = image[left];
                image[left] = 1-image[right];
                image[right] =1- temp;
            }
         if(left == right){
            image[left] = 1 -image[left];  
        }
        left++;
        right--;
     }
         
    }
    public int[][] flipAndInvertImage(int[][] image) {
          for(int i = 0; i < image.length; i++){
            swap(image[i]);
        }
        return image;
    }
}