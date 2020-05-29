class Solution {
    public int tribonacci(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        }
        int a = 0, b = 1, c = 1, sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }
        return sum;
    }
}