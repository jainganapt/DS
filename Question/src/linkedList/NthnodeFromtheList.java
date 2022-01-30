package linkedList;

public class NthnodeFromtheList {
	
	public static void main(String arg[])
	{
		linkedlist l1 = new linkedlist(1);
		
		l1.next = new linkedlist(2);
		l1.next.next = new linkedlist(3);
		l1.next.next.next = new linkedlist(4);
		l1.next.next.next.next = new linkedlist(5);
		l1.next.next.next.next.next = new linkedlist(6);
	
		System.out.println(nodefromend(l1,3));
		
		System.out.println(nodefromend(l1,6));
		System.out.println(nodefromend(l1,7));
		
	}

	
	//https://www.youtube.com/watch?v=-XGTjzz7nEs&list=PLkQkbY7JNJuDqCFncFdTzGm6cRYCF-kZO&index=1	
	private static int nodefromend(linkedlist l1, int num) {
		
		if(l1==null)
		return -1;
		
		linkedlist fast = l1;
		linkedlist head = l1;
		int count=0;
		while(count<num && fast!=null)
		{
			fast=fast.next;
			count++;
		}
		
		if (count == num) {
			while (fast != null) {
				fast = fast.next;
				head = head.next;
			}
			return  head.val;
		} else {

			return -1;
		}
		
		
	}

}
