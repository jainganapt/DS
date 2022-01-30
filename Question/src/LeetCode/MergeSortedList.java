package LeetCode;

public class MergeSortedList {

	public static void main(String arg[]) {
		Node l = new Node(1);
		l.next = new Node(2);
		l.next.next = new Node(3);
		l.next.next.next = new Node(4);
		l.next.next.next.next = new Node(5);

		printlink(l);

		System.out.println(":");

		Node l1 = new Node(1);
		l1.next = new Node(2);
		l1.next.next = new Node(3);
		l1.next.next.next = new Node(4);
		l1.next.next.next.next = new Node(5);

		printlink(l1);

		System.out.println(":");

		Node f = mergenodelist(l, l1);

		printlink(f);

	}

	private static Node mergenodelist(Node l, Node l1) {

		if (l == null && l1 == null)
			return null;

		Node f = new Node(0);
		Node c = f;

		while (l != null && l1 != null) {
			if (l.val >= l1.val) {
				c.next = l1;
				l1 = l1.next;

			} else {
				c.next = l;
				l = l.next;

			}
			c = c.next;

		}
		
		while (l != null) {
			c.next=l;
			l=l.next;
		}
		
		while (l1 != null) {
			c.next=l1;
			l1=l1.next;
		}

		return f.next;

	}

	private static void printlink(Node l) {

		while (l != null) {
			System.out.print("=>" + l.val);
			l = l.next;
		}

	}

}

class Node {

	int val;
	Node next;

	Node(int x) {
		val = x;
	}

}