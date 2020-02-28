// use Stack to complete
import java.util.Stack;
import java.util.HashMap;
public class _practice20 {
	
	public boolean isValid(String str) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put(']','[');
		map.put(')','(');
		map.put('}','{');
		int len = str.length();	
		Stack<Character> s = new Stack<>();
		
		for (int i=0; i<len; i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				char topElement = s.empty()? '#' : s.pop();
				if (topElement != map.get(c)) return false;
			} else {
				s.push(c);
			}
		}
		return s.empty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_practice20 p = new _practice20();
		String str = "[][{}][";
		System.out.println(p.isValid(str));

	}

}
