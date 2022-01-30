package LeetCode;

public class OddEvenLinkedList {

	public static void main(String arg[]) {

		linkedList first = new linkedList(1);

		first.next = new linkedList(2);
		first.next.next = new linkedList(3);
		first.next.next.next = new linkedList(4);
		first.next.next.next.next = new linkedList(5);

		System.out.println("printList");
		printList(first);
		
		System.out.println("printList==>");
		printList(oddevenlist(first));

	}

	private static linkedList oddevenlist(linkedList head) {
		
		
		linkedList odd = head;
		linkedList even = head.next;
		linkedList evenHead = even;
		
		while(evenHead!=null && odd!=null && even!=null && even.next!=null)
		{
			odd.next=even.next;
			odd=odd.next;
			even.next=odd.next;
			even=even.next;
			
		}
		odd.next=evenHead;
		
		return head;
		
	}

	private static void printList(linkedList first) {

		while (first != null) {
			System.out.print("=>" + first.val);
			first = first.next;
		}

	}

}

class linkedList {

	int val;

	linkedList next;

	linkedList(int x) {
		val = x;
	}
}
