
public class practice13 {
	public int romanToInt(String s) {
        int len = s.length();
        int res = 0;
        int tem0 = 1000;
        int tem1 = 0;
        for (int i=0; i<len; i++) {
        	tem1 = this.getValue(s.charAt(i));
        	if (tem0 >= tem1) res = res + tem1;
        	else res = res + tem1 - 2 * tem0;
        	tem0 = tem1;
        	}        		
        return res;
    }

	public int getValue(char c) {
		int ans = 0;
		switch (c) {
    	case 'I':
    		ans = 1;
    		break;
    	case 'V':
    		ans = 5;
    		break;
    	case 'X':
    		ans = 10;
    		break;
    	case 'L':
    		ans = 50;
    		break;
    	case 'C':
    		ans = 100;
    		break;
    	case 'D':
    		ans = 500;
    		break;
    	case 'M':
    		ans = 1000;
    		break;
    	default:
    		System.out.println("wrong character");

    	}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice13 p = new practice13();
		System.out.println(p.romanToInt("MDCLXVI"));
	}

}
