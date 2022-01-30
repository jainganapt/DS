package linkedList;

import org.w3c.dom.NodeList;

interface climb {
	boolean toHigh(int h, int l);
}

public class AddonetoList {

	public static void main(String arg[]) {

		linkedlist l1 = new linkedlist(1);
		l1.next = new linkedlist(2);
		l1.next.next = new linkedlist(3);
		l1.next.next.next = new linkedlist(4);
		l1.next.next.next.next = new linkedlist(5);
		l1.next.next.next.next.next = new linkedlist(6);
		// System.out.println("middle ele"+middleoflist(l1));

		// printlist(l1);
		// System.out.println("=>");
		// linkedlist l2 = revlist(l1);
		// printlist(l2);
		// System.out.println("=>");

		// linkedlist l3 = addonetoList(l2, 100);

		// System.out.println("=>");
		// printlist(revlist(l3));

		// System.out.println("middle ele"+middleoflist(l1));

		// check((h,l)->h.append(l).isEmpty(),5);

		ListNode l4 = new ListNode(3);
		l4.next = new ListNode(7);

		ListNode l5 = new ListNode(9);
		l5.next = new ListNode(2);


		ListNode l6 = addTwoNumbers(l4, l5);

		printlist_2(l6);

	}

	
	
	
	
	public static ListNode addTwoNumbers_3(ListNode l1, ListNode l2) {
		
		return null;
	}
	

	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode l3 = new ListNode(-1);
		ListNode head = l3;

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}
		int carry = 0;

		while (l1 != null && l2 != null) {

			int val = carry+l1.val + l2.val;
			ListNode newNode = new ListNode(val % 10 );
			carry = val / 10;

			l1 = l1.next;
			l2 = l2.next;
			head.next = newNode;
			head=head.next;
		}

		while (l1 != null) {
			int sum = carry + l1.val;
			carry = (sum > 9) ? 1 : 0;

			ListNode new_node = new ListNode(sum % 10);

			head.next = new_node;
			head = head.next;
			l1 = l1.next;
		}

		while (l2 != null) {
			int sum = carry + l2.val;
			carry = (sum > 9) ? 1 : 0;

			ListNode new_node = new ListNode(sum % 10);

			head.next = new_node;
			head = head.next;
			l2 = l2.next;
		}

		if (carry > 0) {
			ListNode new_node = new ListNode(carry);
			head.next = new_node;
			head = head.next;
		}

		return l3.next;
	}

	private static linkedlist addonetoList(linkedlist head, int num) {

		if (head == null)
			return head;

		linkedlist curr = head;

		head.val = head.val + num;
		int carry = head.val / 10;
		head.val = head.val % 10;
		head = head.next;

		while (head != null && carry > 0) {
			head.val = head.val + carry;
			carry = head.val / 10;
			head.val = head.val % 10;
			head = head.next;

		}

		return curr;

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
			System.out.print("=>" + l1.val);
			l1 = l1.next;
		}
	}

	private static void printlist_2(ListNode l1) {

		while (l1 != null) {
			System.out.print("=>" + l1.val);
			l1 = l1.next;
		}
	}

	private static void check(climb l, int h) {

	}

}
