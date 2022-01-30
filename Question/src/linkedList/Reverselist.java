package linkedList;

public class Reverselist {

	public static void main(String arg[]) {

		linkedlist l1 = new linkedlist(1);
		l1.next = new linkedlist(2);

		l1.next.next = new linkedlist(3);
		l1.next.next.next = new linkedlist(4);
		l1.next.next.next.next = new linkedlist(5);
		l1.next.next.next.next.next = new linkedlist(6);

		printlist(revlist(l1));
		printlist(rlist(l1));

	}

	public static linkedlist rlist(linkedlist l1) {
		
		if (l1 == null)
			return null;

		linkedlist prev = null;

		while (l1 != null) {
			linkedlist next = l1.next;
			l1.next = prev;
			prev = l1;
			l1 = next;

		}

		return prev;
	}

	private static linkedlist revlist(linkedlist l1) {

		if (l1 == null)
			return null;
		
		linkedlist prev = null;
		while (l1 != null) {
			linkedlist next = l1.next;
			l1.next = prev;
			prev = l1;
			l1 = next;
		}
		return prev;
	}

	private static void printlist(linkedlist l1) {

		while (l1 != null) {
			System.out.println("=>" + l1.val);
			l1 = l1.next;
		}
	}
}
