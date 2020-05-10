class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j=1;
        for (; i < A.length; i += 2) {
            if (A[i] %2 == 1) {
                while (A[j] % 2 == 1) {
                    j += 2;
                }
                swap(A, i, j);
            }
        }
        return A;
    }

    private void swap(int[] A, int i, int j) {
        int tem = A[i];
        A[i] = A[j];
        A[j] = tem;
    }
}