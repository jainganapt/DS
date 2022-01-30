package linkedList;

import java.util.HashMap;
import java.util.Map;

class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}

public class Copy_random_pointer {

	public static void main(String arg[]) {

		Node list = new Node(1);
		list.next = new Node(2);
		list.next.next = new Node(3);

		copyRandomList_withNoSpace(list);
	}

	public Node copyRandomList(Node head) {

		Map<Node, Node> data = new HashMap<>();
		Node temp = head;
		while (head != null) {
			Node newNode = new Node(head.val);
			data.put(head, newNode);
			head = head.next;
		}
		head = temp;

		while (head != null) {

			data.get(head).next = data.get(head.next);
			data.get(head).random = data.get(head.random);
			head = head.next;

		}

		return data.get(temp);
	}

	public static void print(Node list) {
		while (list != null) {

			System.out.print("val-> " + list.val + " :");
			list = list.next;
		}

		System.out.println();
	}

	public static Node copyRandomList_withNoSpace(Node head) {

		if (head == null) {
			return null;
		}
		Node temp = head;
		Node next = head.next;
		print(head);

		// copy list
		while (temp != null) {
			Node newNode = new Node(temp.val);
			temp.next = newNode;
			newNode.next = next;
			temp = next;
			if (next != null)
				next = temp.next;
		}
		print(head);

		// copy random ptr
		temp = head;
		next = head.next;

		while (temp != null) {
			if(temp.random!=null) {
				temp.next.random = temp.random.next;
			}
			temp = temp.next.next;
		}
		
		//deattach list now 
		
		Node dummy = new Node(-1);
		temp = head;
		Node tail=dummy;
		
		while(temp!=null)
		{
			tail.next=temp.next;
			temp.next=tail.next.next;
			temp=temp.next;
			tail=tail.next;
		}
		

		return dummy.next;
	}
}
