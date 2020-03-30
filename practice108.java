import java.util.Arrays;

public class practice108 {

	public TreeNode sortedArrayToBST(int[] nums) {
		int len = nums.length;
		if (len == 0) return null;
		if (len == 1) return new TreeNode(nums[0]);
		TreeNode root = new TreeNode(nums[len / 2]);
		int[] numsL = Arrays.copyOf(nums, len/2);
		int[] numsR = Arrays.copyOfRange(nums, len/2 + 1, len);
		root.left = this.sortedArrayToBST(numsL);
		root.right = this.sortedArrayToBST(numsR);
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,3,4,5};
		int len = nums.length;
		System.out.println(Arrays.toString(Arrays.copyOf(nums, len/2)));
	}

}
