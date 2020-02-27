
public class practice20 {
	
	public boolean isValid(String s) {
		int len = s.length();
		int origin_len = len;
		if (origin_len == 0) return true;
        if (origin_len % 2 != 0) return false;
		if (flag(s.charAt(0))<0) return false;
		int pointer = 1;
		for (int i=1; i<origin_len; i++) {
			if (flag(s.charAt(pointer))>0) {
				pointer++;
				continue;
			}
			if (flag(s.charAt(pointer))<0 && wait(s.charAt(pointer-1)) != s.charAt(pointer)) {
				//System.out.println(wait(s.charAt(pointer-1)));
				//System.out.println(s.charAt(pointer));
				return false;
			}
			if (flag(s.charAt(pointer))<0 && wait(s.charAt(pointer-1)) == s.charAt(pointer)) {
				s = s.substring(0,pointer-1) + s.substring(pointer+1,len);
				len = s.length();
				pointer--;
			}
		}
		return pointer==0;
	}
	
	public int flag(char c) {
		int ans = 0;
		switch (c) {
		case '(' :
		case '{' :
		case '[' :
			ans = 1;
			break;
		case ')' :
		case ']' :
		case '}' :
			ans = -1;
			break;
		}
		return ans;
	}
	
	public char wait(char c) {
		char ans = '-';
		switch (c) {
		case '(' :
			ans = ')';
			break;
		case '{' :
			ans = '}';
			break;
		case '[' :
			ans = ']';
			break;
		}
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice20 p = new practice20();
		String str = "([{}])[]()";
		boolean x = p.isValid(str);
		System.out.println(x);
		
	}

}
