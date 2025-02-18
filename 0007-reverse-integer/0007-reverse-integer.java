class Solution {
    public int reverse(int x) {
        long rev = 0; // Use long to handle potential overflow
        boolean isNegative = false;

        if (x < 0) {
            x = -x;
            isNegative = true;
        }

        while (x > 0) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x = x / 10;
        }

        if (isNegative) {
            rev = -rev;
        }

        // Check for overflow
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) rev;
    }
}
