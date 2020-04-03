import java.util.HashMap;
public class practice8 {

	public int myAtoi(String str) {
		HashMap<String, String[]> map = new HashMap<>();
		map.put("START", new String[] {"START","SIGNED","IN_NUM","END"});
		map.put("SIGNED", new String[] {"END","END","IN_NUM","END"});
		map.put("IN_NUM", new String[] {"END","END","IN_NUM","END"});
		map.put("END", new String[] {"END","END","END","END"});
		String state = "START";
		
		int index = 0;
		int flag = 1;
		int ans = 0;
		char[] s = str.toCharArray();
		while (index < s.length) {
			char c = s[index];
			state = map.get(state)[jump(c)];
			index ++;
			if (state == "END") break;
			else if (state == "SIGNED" && c == '-') flag = -1;
			else if (state == "IN_NUM") {
				int digit = c - '0';
				if (ans > (Integer.MAX_VALUE - digit) / 10) 
					return flag == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
				ans = ans * 10 + digit;
			}
			else continue;
		}
		return flag * ans;
	}
	
	private int jump(char c) {
		if (c == ' ') return 0;
		else if (c == '+' || c == '-') return 1;
		else if (c >= '0' && c <= '9') return 2;
		else return 3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice8 p = new practice8();
		int ans = p.myAtoi(" -999");
		System.out.println(ans);

	}

}
