import java.util.Scanner;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 }; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int a = sc.nextInt();
        int[] num = new int[a];
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }
        int[] result = twoSum(num, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
