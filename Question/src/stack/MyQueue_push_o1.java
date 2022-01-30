package stack;

import java.util.Stack;

public class MyQueue_push_o1 {

	Stack<Integer> s1;
	Stack<Integer> s2;

	public MyQueue_push_o1() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	public void push(int x) {
		s1.add(x);
	}

	public int pop() {

		if (s2.isEmpty()) {

			while (!s1.isEmpty()) {
				s2.add(s1.pop());
			}

		}
		return s2.pop();

	}

	public int peek() {

		return s2.peek();
	}

	public boolean empty() {

		return s1.isEmpty() && s2.isEmpty();
	}

	public static void main(String arg[]) {
		MyQueue obj = new MyQueue();

	}
}
