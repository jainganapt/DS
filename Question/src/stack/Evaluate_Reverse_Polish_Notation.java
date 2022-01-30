package stack;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
	public static void main(String arg[]) {

	}

	public static int evalRPN(String[] tokens) {

		Stack<Integer> st = new Stack<>();

		for (String s : tokens) {
			if ("+*-/".contains(s)) {
				
				int b = st.pop();
				int a = st.pop();

				if (s.equals("\\")) {
					st.push(a/b);
				}
				if (s.equals("*")) {
					st.push(a*b);
				}
				if (s.equals("+")) {
					st.push(a+b);
				}
				if (s.equals("-")) {
					st.push(a-b);
				}
			} else {
				st.add(Integer.parseInt(s));
			}
		}
		
		return st.peek();
	}
}
