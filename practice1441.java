import java.util.List;
import java.util.ArrayList;


public class practice1441 {
    public List<String> buildArray(int[] target, int n) {
        if (target.length == 0) return new ArrayList<>();
        List<String> list = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (target[index] == i) {
                list.add("Push");
                index ++;
            } else {
                list.add("Push");
                list.add("Pop");
            }
            
            if (index == target.length) {
                break;
            }
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1441 p = new practice1441();
		int[] target = {1,3,4,6,7,8};
		int n = 9;
		List<String> res = p.buildArray(target, n);
		for (String string : res) {
			System.out.println(string);
		}
	}

}
