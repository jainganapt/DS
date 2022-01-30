package JavaArray30;

public class LinkedList {

	public static void main(String arg[]) {
		list l = new list(1);
		l.next = new list(2);
		l.next.next = new list(3);
		l.next.next.next = new list(4);
		l.next.next.next.next = new list(5);

		prntlist(l);

		System.out.println();
		list l2 = revlist(l);

		prntlist(l2);

	}

	private static list revlist(list l) {

		if (l == null)
			return null;

		list prev = null;

		while (l != null) {
			list nextnode = l.next;
			l.next = prev;
			prev = l;
			l = nextnode;

		}

		return prev;

	}

	private static void prntlist(list l) {

		while (l != null) {
			System.out.print("=>" + l.a);
			l = l.next;
		}

	}

}

class list {

	int a;
	list next;

	list(int aa) {
		this.a = aa;
	}

}
