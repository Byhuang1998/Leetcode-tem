import java.util.HashMap;
public class practice1160 {

	public int countCharacters(String[] words, String chars) {
		int num = words.length;
		int len = chars.length();
		int res = 0;
		HashMap<Character, Integer> char_map = new HashMap<>();
		for (int i=0; i<len; ++i) {
			char tem = chars.charAt(i);
			if (!char_map.containsKey(tem))
				char_map.put(tem, 1);
			else 
				char_map.put(tem, char_map.get(tem)+1);
		}
		for (int i=0; i<num; i++) {
			int count = 0;
			String word = words[i];
			int cur_len = word.length();
			HashMap<Character, Integer> word_map = new HashMap<>();
			for (int j=0; j<cur_len; j++) {
				char tem = word.charAt(j);
				if (!word_map.containsKey(tem))
					word_map.put(tem, 1);
				else 
					word_map.put(tem, word_map.get(tem)+1);			
			}
			for (int j=0; j<cur_len; ++j) {
				char cur_char = word.charAt(j);
				count = cur_len;
				if (!char_map.containsKey(cur_char) || word_map.get(cur_char) > char_map.get(cur_char)) {
					count = 0;
					break;
				}
			}
			res += count;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1160 p = new practice1160();
		String[] words = {"hello","world","leetcode"};
		String chars = "welldonehoneyr";
		int res = p.countCharacters(words, chars);
	    System.out.println(res);
		
	}

}
