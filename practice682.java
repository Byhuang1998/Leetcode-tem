import java.util.Stack;

public class practice682 {
    public int calPoints(String[] ops) {
    	
    	Stack<Integer> stack = new Stack<>();
    	for (String s : ops) {
    		if (s.equals("C")) {
    			stack.pop();
    		} else if (s.equals("D")) {
    			stack.push(stack.peek() * 2);
    			
    		} else if (s.equals("+")) {
    			int tem = stack.pop();
    			int cur = tem + stack.peek();
    			stack.push(tem);
    			stack.push(cur);
    		} else {
    			stack.push(Integer.valueOf(s));
    		}
    	}
    	int sum = 0;
    	while (! stack.isEmpty()) {
    		sum += stack.pop();
    	}
    	return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice682 p = new practice682();
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		int sum = p.calPoints(ops);
		System.out.println(sum);
	}

}
