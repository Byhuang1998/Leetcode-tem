
public class practice1576 {
	

    public String modifyString(String s) {
    	int n = s.length();
    	char[] arr = s.toCharArray();
    	for (int i = 0; i < n; i++) {
			if (arr[i] == '?') {
				for (char ch = 'a'; ch < 'd'; ch++) {
					if (i>0 && ch == arr[i-1] || i<n-1 && ch == arr[i+1]) { //这个判断是关键
						continue;
					}
					arr[i] = ch;
					break;
				}
			}
		}
    	return new String(arr);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub"??yw?ipkj?"
		String string = "??yw?ipkj?";
		practice1576  p = new practice1576();
		String string2 = p.modifyString(string);
		System.out.println(string2);

	}

}
