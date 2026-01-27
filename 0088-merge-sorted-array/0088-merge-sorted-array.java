class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] result = new int[m+n];
        int a = 0, b = 0, index = 0;
        while(a<m && b<n){
            if(nums1[a] < nums2[b]){
                result[index] = nums1[a];
                a++;
            }
            else{
                result[index] = nums2[b];
                b++;
            }
            index++;
        }
        while(a<m){
            result[index] = nums1[a];
            index++;
            a++;
        }
        while(b<n){
            result[index] = nums2[b];
            index++;
            b++;
        }
        for(int i=0;i< result.length;i++){
            nums1[i] = result[i];
        }
    }
}