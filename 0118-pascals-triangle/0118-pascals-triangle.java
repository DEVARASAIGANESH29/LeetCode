class Solution {
    public static List<Integer> generatep(int row){
        long ans = 1;
        List<Integer> ansr = new ArrayList<>();
        ansr.add(1);

        for(int col=1;col<row;col++){
            ans = ans * (row - col);
            ans = ans / col;
            ansr.add((int)ans);
        }
        return ansr;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            ans.add(generatep(row));
        }
        return ans;
    }
}