class Solution {
    public boolean validMountainArray(int[] A) {
        int len = A.length;
        if (len < 3) return false;
        int i = 1, j = len - 2;
        while (i < len && A[i] > A[i - 1]) {
            i++;
        }
        while (j >= 0 && A[j] > A[j + 1]) {
            j--;
        }
        if (j == len - 2 || i == 1) return false;
        return i - j == 2;
    }
}