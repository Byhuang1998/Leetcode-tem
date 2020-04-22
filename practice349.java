class Solution {
    public void sort(int[] nums, int len) {
        for (int i=0; i<len-1; i++) {
            int index = i;
            int tem = nums[i];
            for (int j=i+1; j<len; j++) {
                if (nums[j] < tem) {
                    index = j;
                    tem = nums[j];
                }
            }
            if (index > i) {
                int num = nums[i];
                nums[i] = nums[index];
                nums[index] = num;
            }
        }
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 == 0 || len2 == 0) return new int[0];
        sort(nums1, len1);
        sort(nums2, len2);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] == nums2[j]) {
                if (count == 0 || nums1[i] != list.get(count-1)) {
                    list.add(nums1[i]);
                    count ++;
                }
                i ++;
                j ++;
            } else if (nums1[i] < nums2[j]) {
                i ++;
            } else {
                j ++;
            }
        }
        int[] ans = new int[count];
        for (int k=0; k<count; k++) {
            ans[k] = list.get(k);
        }
        return ans;
    }
}