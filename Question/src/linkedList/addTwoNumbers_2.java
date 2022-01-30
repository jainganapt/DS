package linkedList;

import java.util.Stack;

public class addTwoNumbers_2 {

	public static void main(String arg[]) {

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(4);
		l1.next.next.next = new ListNode(5);
		l1.next.next.next.next = new ListNode(5);
		l1.next.next.next.next.next = new ListNode(6);
		//l1.next.next.next.next.next.next = null;
		printlist(l1);

		/// ListNode l2 =reverseBetween(l1,2,4);
		// reorderList(l1);
		// printlist(l2);

		printlist(partition(l1, 2));
		
		printlist(deleteDuplicates(l1));

	}

	public static void printlist(ListNode l1) {

		while (l1 != null) {
			System.out.print(": " + l1.val);
			l1 = l1.next;
		}

		System.out.println();
	}

	public ListNode reverse(ListNode l1) {
		ListNode prev = null;
		ListNode temp = l1;

		while (temp != null) {
			ListNode next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}

		return prev;

	}

	public static ListNode reversedata(ListNode l1, int till) {

		ListNode prev = null;
		ListNode temp = l1;

		int count = 0;
		System.out.println("temp" + temp.val);
		while (temp != null && count != till) {
			System.out.println("temp" + temp.val);
			ListNode next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
			count++;
		}

		return prev;

	}

	public static ListNode reverseBetween(ListNode head, int left, int right) {

		ListNode temp = head;
		ListNode prev = null;

		if (head == null || left == right) {
			return head;
		}

		while (left > 1) {
			// System.out.print("left -> "+left);
			left--;
			right--;
			prev = temp;
			temp = temp.next;
		}

		ListNode connect = prev;
		ListNode tail = temp;

		while (right > 0) {
			ListNode next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
			right--;
		}

		if (connect != null) {
			connect.next = prev;
		} else {
			head = prev;
		}

		tail.next = temp;

		return head;

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

		l1 = reverse(l1);
		l2 = reverse(l2);

		int carry = 0;

		ListNode l3 = new ListNode(-1);
		ListNode dummy = l3;

		while (l1 != null && l2 != null) {
			// System.out.println("carry both ->" +carry);
			int val = carry + l1.val + l2.val;
			carry = val / 10;
			val = val % 10;

			ListNode newNode = new ListNode(val);
			l3.next = newNode;

			l1 = l1.next;
			l2 = l2.next;
			l3 = l3.next;
		}

		while (l1 != null) {
			// System.out.println("carry l1->" +carry);
			int val = carry + l1.val;
			carry = val / 10;
			val = val % 10;
			ListNode newNode = new ListNode(val);
			l3.next = newNode;
			l1 = l1.next;
			l3 = l3.next;
		}

		while (l2 != null) {
			// System.out.println("carry l2->" +carry);

			int val = carry + l2.val;
			carry = val / 10;
			val = val % 10;
			ListNode newNode = new ListNode(val);
			l3.next = newNode;
			l2 = l2.next;
			l3 = l3.next;
		}

		if (carry > 0) {
			// System.out.println("carryf "+carry);
			ListNode newNode = new ListNode(carry);
			l3.next = newNode;
		}

		return reverse(dummy.next);
	}

	public ListNode addTwoNumbers_withStack(ListNode l1, ListNode l2) {

		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		Stack<Integer> s3 = new Stack<>();

		while (l1 != null) {
			s1.add(l1.val);
			l1 = l1.next;
		}

		while (l2 != null) {
			s2.add(l2.val);
			l2 = l2.next;
		}

		int carry = 0;
		while (!s1.empty() && !s2.isEmpty()) {

			int val = s1.pop() + s2.pop() + carry;
			s3.add(val % 10);
			carry = val / 10;
		}

		while (!s1.empty()) {

			int val = s1.pop() + carry;
			s3.add(val % 10);
			carry = val / 10;
		}

		while (!s2.isEmpty()) {

			int val = s2.pop() + carry;
			s3.add(val % 10);
			carry = val / 10;
		}

		if (carry > 0) {
			s3.add(carry);
		}

		ListNode head = new ListNode(-1);
		ListNode dummy = head;

		while (!s3.isEmpty()) {

			ListNode newNode = new ListNode(s3.pop());
			dummy.next = newNode;
			dummy = dummy.next;

		}

		return head.next;

	}

	public static ListNode rev(ListNode head) {

		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}

		return prev;
	}

	public static void reorderList(ListNode head) {

		ListNode fptr = head;
		ListNode sptr = head;
		ListNode prev = null;
		while (fptr != null && fptr.next != null) {
			prev = sptr;
			sptr = sptr.next;
			fptr = fptr.next.next;

		}
		// prev.next=sptr;
		sptr = rev(sptr);
		prev.next = sptr;
		int count = 1;
		ListNode dummy = new ListNode(-1);
		ListNode c = dummy;
		ListNode curr = head;

		printlist(curr);

		while (sptr != null && curr != null) {
			if (count == 1) {
				c.next = curr;
				c = c.next;
				curr = curr.next;

				count = 0;
			} else {
				c.next = sptr;
				c = c.next;
				sptr = sptr.next;
				count = 1;
			}

		}

		head = dummy.next;
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {

		if (head == null)
			return head;

		ListNode temp = head;

		while (temp != null) {
			temp = temp.next;
			n--;
		}

		if (n > 0 && temp == null) {
			return head;
		}

		ListNode curr = head;
		ListNode prev = null;
		while (temp != null) {
			temp = temp.next;
			prev = curr;
			curr = curr.next;
		}

		prev.next = curr.next;

		return head;

	}

	public static ListNode partition(ListNode head, int x) {

		if (head == null) {
			return null;
		}

		ListNode curr = head;

		ListNode temp1 = new ListNode(-1);
		ListNode dummy1 = temp1;
		ListNode temp2 = new ListNode(-1);
		ListNode dummy2 = temp2;

		while (curr != null) {

			if (curr.val < x) {

				dummy1.next = curr;
				dummy1 = dummy1.next;
				curr = curr.next;
			} else {

				dummy2.next = curr;
				dummy2 = dummy2.next;
				curr = curr.next;
			}

		}
		dummy1.next = temp2.next;

		return temp1.next;
	}

	public static ListNode oddEvenList(ListNode head) {

		if (head == null) {
			return null;
		}

		ListNode curr = head;

		ListNode temp1 = new ListNode(-1);
		ListNode dummy1 = temp1;
		ListNode temp2 = new ListNode(-1);
		ListNode dummy2 = temp2;

		int count = 0;
		while (curr != null) {

			if (count == 0) {

				dummy1.next = curr;
				dummy1 = dummy1.next;
				curr = curr.next;

				count = 1;
			} else {

				dummy2.next = curr;
				dummy2 = dummy2.next;
				curr = curr.next;

				count = 0;
			}

		}
		dummy2.next = null;
		dummy1.next = temp2.next;

		return temp1.next;
	}

	public static ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode curr = head;
		ListNode prev = null;

		while (curr != null && curr.next!=null) {

			ListNode next = curr.next;
			
			if (curr.val == next.val) {

				//System.out.println("print1->" +curr.val);
				//System.out.println("print2->" +next.val);
				ListNode temp = next;

				while (temp != null && temp.val == curr.val) {
					temp = temp.next;
				}

				//System.out.println("print3->" +temp.val);
				
				if (prev == null) {
					curr = temp;
					head = temp;
				} else {
					prev.next = temp;
					//prev = curr;
					curr=temp;
				}
			}
			else {
				
				prev=curr;
				curr=next;
				
			}
			
			if (prev!=null ) 
			System.out.println("prev->" +prev.val) ;
			else 
			System.out.println("null");

		}
		return head;

	}
	
	
	public static ListNode swapPairs(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode temp = new ListNode(-1);
		ListNode Dummy = temp;
		
		ListNode curr = head;
		ListNode prev = null;

		while (curr != null && curr.next != null) {
			
			ListNode next = curr.next;
			
			Dummy.next=curr.next;
			curr.next =prev;
			
		}
		
		
		return temp.next;

	}
	 
	
	public static ListNode rotateRight(ListNode head, int k) {


        int len = 0;

		ListNode curr = head;

		while (curr != null) {
			len++;
            curr=curr.next;
		}

		k = k % len;
		
		ListNode fptr = head;
		ListNode sptr = head;
		
		while(k>0)
		{
			fptr=fptr.next;
            k--;
		}
		
		while(fptr.next!=null)
		{
			sptr=sptr.next;
			fptr=fptr.next;
		}
		
		fptr.next=head;
		
		head=sptr.next;
		sptr.next=null;
		
		return head;

	}
	
}
