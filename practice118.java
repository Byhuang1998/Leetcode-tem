import java.util.List;
import java.util.ArrayList;
public class practice118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
    	if (numRows <= 0) return ans;
        List<Integer> first = new ArrayList<>(); first.add(1);
        ans.add(first);
        if (numRows == 1) return ans;
        List<Integer> second = new ArrayList<>(); second.add(1); second.add(1);
        ans.add(second);
        for (int i=2; i<numRows; ++i) {
        	List<Integer> cur = new ArrayList<>();
        	cur.add(1);
        	for (int j=1; j<i; j++) {
        		int x = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
        		cur.add(x);
        	}
        	cur.add(1);
        	ans.add(cur);
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice118 p = new practice118();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		ans = p.generate(2);
		for (int i=0; i<2; i++) {
			System.out.println(ans.get(i));
		}
	}

}
