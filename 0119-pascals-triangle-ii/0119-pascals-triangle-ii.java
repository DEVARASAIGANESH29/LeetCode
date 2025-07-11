class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ansr = new ArrayList<>();
        ansr.add(1);
        long ans = 1;
        for(int col = 1;col<=rowIndex;col++){
            ans = ans * (rowIndex + 1 - col);
            ans = ans / col;
            ansr.add((int)ans);
        }
        return ansr;
    }
}