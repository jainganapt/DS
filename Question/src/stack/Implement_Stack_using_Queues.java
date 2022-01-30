package stack;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queues {

	Queue<Integer> q1;
	Queue<Integer> q2;

	public Implement_Stack_using_Queues() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();

	}

	public void push(int x) {

		q1.add(x);

		while (!q2.isEmpty()) {
			q1.add(q2.poll());
		}
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;

	}

	public int pop() {

		if (q2.isEmpty()) {
			return -1;
		} else {
			return q2.poll();
		}

	}

	public int top() {

		if (q2.isEmpty()) {
			return -1;
		} else {
			return q2.peek();
		}

	}

	public boolean empty() {

		return q2.isEmpty();
	}

}
