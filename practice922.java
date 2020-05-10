class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int i = 0;
        int j = 1;
        for (int n : A) {
            if (n % 2 == 0) {
                res[i] = n;
                i += 2;
            } else {
                res[j] = n;
                j += 2;
            }
        }
        return res;
    }
}