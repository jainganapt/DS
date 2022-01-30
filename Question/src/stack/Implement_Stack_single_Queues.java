package stack;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_single_Queues {

	Queue<Integer> q1;
	// Queue<Integer> q2;

	public Implement_Stack_single_Queues() {

		q1 = new LinkedList<>();
		// q2 = new LinkedList<>();

	}

	public void push(int x) {

		q1.add(x);

		int size = q1.size() - 1;
		while (size > 0) {
			q1.add(q1.poll());
			size--;
		}
	}

	public int pop() {

		return null == q1.peek() ? 0 : q1.poll();

	}

	public int top() {

		if (q1.isEmpty()) {
			return -1;
		} else {
			return q1.peek();
		}
	}

	public boolean empty() {

		return q1.isEmpty();
	}
}
