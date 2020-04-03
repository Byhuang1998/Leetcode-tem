import java.util.ArrayList;
import java.util.List;
public class practice119 {

	public List<Integer> getRow(int rowIndex) {
		List<Integer> preRow = new ArrayList<>();
		List<Integer> curRow = new ArrayList<>();
 		preRow.add(1);
 		if (rowIndex == 0) return preRow;
		curRow.add(1); curRow.add(1);
		if (rowIndex == 1) return curRow;
 		for (int i=2; i<=rowIndex; ++i) {
 			preRow = curRow;
			List<Integer> temRow = new ArrayList<>();
			temRow.add(1);
			for (int k=1; k<i; ++k) {
				int tem = preRow.get(k-1) + preRow.get(k);
				temRow.add(tem);
			}
			temRow.add(1);
			curRow = temRow;
		}
		return curRow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice119 p = new practice119();
		List<Integer> ans = p.getRow(1);
		System.out.println(ans);
	}

}
