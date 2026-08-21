class Solution {
    public int merge(int[][] result,int[][] nums1,int[][]nums2){
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i][0] == nums2[j][0]){
                result[index][0] = nums1[i][0];
                result[index][1] = nums1[i][1]+nums2[j][1];
                index++;
                i++;
                j++;
            }
            else if(nums1[i][0] < nums2[j][0]){
                result[index][0] = nums1[i][0];
                result[index][1] = nums1[i][1];
                index++;
                i++;
            }
            else if(nums1[i][0] > nums2[j][0]){
                result[index][0] = nums2[j][0];
                result[index][1] = nums2[j][1];
                index++;
                j++;
            }
            
        }
        while(i < nums1.length){
            result[index][0] = nums1[i][0];
            result[index][1] = nums1[i][1];
            index++;
            i++;
        }
        while(j <nums2.length){
            result[index][0] = nums2[j][0];
            result[index][1] = nums2[j][1];
            index++;
            j++;
        }
        return index;
    }
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int a = nums1.length+ nums2.length;
        int [][] result = new int[a][2];
        int uniqueElementsCount = merge(result,nums1,nums2);
        return Arrays.copyOf(result, uniqueElementsCount);
    }
}