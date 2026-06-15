class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        int sorted [] = new int [friends.length];
        for(int i = 0;i< friends.length;i++){
            set.add(friends[i]);
        }
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                sorted[index] = order[i];
                index++;
            }
        }
        return sorted;
    }
}