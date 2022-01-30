package LinkedList2;

import java.util.Stack;

class ListNode {

	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	ListNode() {
	}
}

public class ReverseList {

	public static void main(String arg[]) {

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(3);
		//l1.next.next.next.next = new ListNode(2);
		//l1.next.next.next.next.next = new ListNode(1);
		System.out.println();
		print(l1);
		// ListNode rprint = reverseList(l1);

		// System.out.println();
		// print(rprint);

		// ListNode prgroup =reverseList_withGroup(l1,2);
		// System.out.println();
		// print(prgroup);
		// System.out.println(isPalindrome(l1));
		print(l1);
		//System.out.println(rec_with_stack(l1));
		//System.out.println(getIntersectionNode(l1,l1));
		
		print(deleteDuplicates(l1));

	}

	public static ListNode reverseList_withGroup(ListNode head, int n) {

		if (head == null)
			return null;

		ListNode prev = null;
		ListNode next = null;
		ListNode current = head;
		int k = 0;
		while (head != null && k < n) {

			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			k++;
		}
		if (next != null) {
			head.next = reverseList_withGroup(next, k);
		}
		return prev;

	}

	public static ListNode reverseList(ListNode head) {

		if (head == null)
			return null;

		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}

		return prev;
	}

	public static void print(ListNode l1) {
		while (l1 != null) {
			System.out.print("->" + l1.val);
			l1 = l1.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode head = new ListNode();
		ListNode data = head;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				data.next = list1;
				list1 = list1.next;
			} else {
				data.next = list2;
				list2 = list2.next;
			}
			data = data.next;
		}

		data.next = list1 == null ? list2 : list1;
		return head.next;

	}

	public static boolean hasCycle(ListNode head) {

		if (head == null || head.next == null) {
			return false;
		}

		ListNode fptr = head;
		ListNode sptr = head;

		while (fptr != null && fptr.next != null) {
			fptr = fptr.next.next;
			sptr = sptr.next;
			if (fptr == sptr)
				return true;
		}

		return false;

	}

	public static boolean rec_with_stack(ListNode head) {

		if (head == null || head.next == null) {
			return true;
		}

		ListNode curr = head;
		Stack<Integer> st = new Stack<>();

		while (head != null) {
			st.push(head.val);
			head = head.next;
		}

		while (!st.isEmpty()) {

			if (curr.val != st.peek()) {
				return false;
			} else {
				curr = curr.next;
				st.pop();
			}
		}

		return true;
	}

	public static boolean isPalindrome(ListNode head) {

		if (head.next == null) {
			return true;
		}

		ListNode curr = head;
		ListNode slowptr = head;
		ListNode fastwptr = head;

		while (fastwptr != null && fastwptr.next != null) {
			fastwptr = fastwptr.next.next;
			slowptr = slowptr.next;
		}
		System.out.println("slowptr" + slowptr.val);
		ListNode newNode = reverseList(slowptr);
		print(curr);
		System.out.println("fastwptr" + slowptr.val);

		print(newNode);

		while (newNode != null) {
			System.out.println("headll" + curr.val + ":->" + newNode.val);
			if (curr.val != newNode.val) {
				System.out.println("headll");
				return false;
			} else {
				newNode = newNode.next;
				curr = curr.next;
			}
		}

		return true;

	}

	public static ListNode removeElements(ListNode head, int val) {

		if (head.next == null && head.val == val) {
			return null;
		}
		ListNode curr = head;
		ListNode prev = null;
		ListNode next = curr;
		while (curr != null && next != null) {
			next = curr.next;
			if (curr.val == val) {
				if (prev != null)
					prev.next = next.next;
			}
			prev = curr;
			curr = next;
		}
		if (curr.val == val) {
			return prev;
		}
		return prev;

	}

	public static ListNode removeElements_2(ListNode head, int val) {
		ListNode prev = null;
		ListNode temp = head;
		while (head != null) {
			if (head.val == val) {
				if (prev == null) {
					temp = head.next;
				} else {
					prev.next = head.next;
				}
			} else {
				prev = head;
			}
			head = head.next;
		}
		return temp;
	}

	public static int getDecimalValue(ListNode head) {

		ListNode curr = head;
		ListNode prev = null;

		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		int sum = 0;
		int k = 0;
		while (prev != null) {
			sum = (int) (sum + prev.val * Math.pow(2, k));
			k++;
			prev = prev.next;
		}

		return sum;

	}

	public static ListNode middleNode(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}
		ListNode fptr = head;
		ListNode sptr = head;

		while (fptr != null && fptr.next != null) {
			fptr = fptr.next.next;
			sptr = sptr.next;
		}

		return sptr;

	}

	
	public static ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode prev = null;
		ListNode curr = head;
		ListNode next = head.next;

		while (curr != null && curr.next!=null) {

			if (prev != null) {
				if (curr.val == prev.val) {
					prev.next = curr.next;
					curr = next;
					next = curr.next;
				} else {
					prev = curr;
					curr = next;
					next = curr.next;
				}
			}
		}
		return head;
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {
			return null;
		}
		ListNode temp1 = headA;
		ListNode temp2 = headB;
		int len1 = 0;
		int len2 = 0;
		int diff=0;

		while (temp1 != null) {
			len1++;
			temp1 = temp1.next;
		}
		while (temp2 != null) {
			len2++;
			temp2 = temp2.next;
		}

		if (len2 > len1) {
			
			diff = len2 - len1;

			while (diff>0) {
				headB = headB.next;
				diff--;
			}

		} else {

			System.out.println("hererer"+len1+len2);
			diff = len1 - len2;

			while (diff>0) {
				headA = headA.next;
				diff--;
			}

		}
		
		System.out.println("len1"+len1);
		System.out.println("len2"+len2);
		
		System.out.println("head-->"+headA.val+"val-->"+headB.val);
		
		while(headA!=null && headB!=null)
		{
			System.out.println("hello");
			if(headA==headB)
			{
				return headA;
			}
			else {
				headB = headB.next;
				headA = headA.next;
			}
		}
		
	  return null;
	}
}
