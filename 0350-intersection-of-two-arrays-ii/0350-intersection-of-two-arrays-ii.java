class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int a = 0;
        int b = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer>list = new ArrayList<>();
        while(a<nums1.length && b<nums2.length){
            if(nums1[a] == nums2[b]){
                list.add(nums1[a]);
                a++;
                b++;
            }
            else if(nums1[a] < nums2[b]){
                a++;
            }
            else{
                b++;
            }

        }
        int [] result = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}