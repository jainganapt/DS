package LeetCode;

public class DeleteNodeFromList {

	public static void main(String arg[]) {
		List2 l = new List2(1);
		l.next = new List2(2);
		l.next.next = new List2(3);
		l.next.next.next = new List2(4);
		l.next.next.next.next = new List2(4);
		l.next.next.next.next.next = new List2(4);

		printlist(l);

		List2 l2 = delenode(l, 4);

		printlist(l2);

	}

	private static List2 delenode(List2 head, int value) {

		;

		if (head == null)
			return null;

		if (head!= null && head.val == value)
			return head.next;

		List2 cur_node = head;
				
		while (cur_node != null && cur_node.next!= null) {
	
			if(cur_node.next.val==value)
			{
				cur_node.next=cur_node.next.next;
			}
			else {
				cur_node=cur_node.next;
			}
		}

		return head;

	}

	private static void printlist(List2 l) {

		while (l != null) {
			System.out.print("=>" + l.val);
			l = l.next;
		}
	}

}
