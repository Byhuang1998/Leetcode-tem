import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
public class practice46 {

	public List<List<Integer>> permute(int[] nums) {
		int len = nums.length;
		List<List<Integer>> res = new ArrayList<>();
		if (len == 0) {
			return res;
		}
		boolean[] used = new boolean[len];
		int depth = 0;
		Stack<Integer> path = new Stack<>();
		dfs(nums, path, used, depth, res);
		return res;
	}
	private void dfs(int[] nums, Stack<Integer> path, boolean[] used, int depth, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if (depth == nums.length) {
			res.add(new ArrayList<>(path));
			return;
		}
		for (int i=0; i<nums.length; i++) {
			if (used[i]) {
				continue;
			}
			path.push(nums[i]);
			used[i] = true;
			dfs(nums, path, used, depth+1, res);
			used[i] = false;
			path.pop();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3};
		practice46 p = new practice46();
		List<List<Integer>> res = p.permute(nums);
		Iterator<List<Integer>> it = res.iterator();
		while (it.hasNext()) {
			List<Integer> list = it.next();
			Iterator<Integer> ii = list.iterator();
			while (ii.hasNext()) {
				System.out.print(ii.next() + " ");
			}
			System.out.println();
		}
	}

}
