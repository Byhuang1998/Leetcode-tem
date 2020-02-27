import java.util.HashMap;
public class practice13 {
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
        int len = s.length();
        int res = 0;
        int tem0 = 1000;
        int tem1 = 0;
        for (int i=0; i<len; i++) {
        	tem1 = map.get(s.charAt(i));
        	if (tem0 >= tem1) res = res + tem1;
        	else res = res + tem1 - 2 * tem0;
        	tem0 = tem1;
        	}        		
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice13 p = new practice13();
		System.out.println(p.romanToInt("CMXCIX"));
	}

}
