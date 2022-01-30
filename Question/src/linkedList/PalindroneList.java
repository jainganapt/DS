package linkedList;

public class PalindroneList {

	public static void main(String arg[])
	{
		
		linkedlist l1 = new linkedlist(1);
		l1.next = new linkedlist(2);
		l1.next.next = new linkedlist(3);
		l1.next.next.next = new linkedlist(2);
		l1.next.next.next.next = new linkedlist(1);
		//l1.next.next.next.next.next = new linkedlist(1);
		
		System.out.println(palindron(l1));
		
		
		//l1.next.next.next.next.next = new linkedlist(1);
		
		//palindron(l1);
		
	}

	private static boolean palindron(linkedlist l1) {
		
		linkedlist fast =l1;
		linkedlist slow =l1;
		linkedlist prev =null;
		 
		if(l1==null ||l1.next==null)
		return false;
		
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			prev=slow;
			slow=slow.next;
		}
		linkedlist l2=null;
		if(fast==null)
		{
			System.out.println("slow"+slow.val);
			 l2= rev(slow);
			 System.out.println("l2"+l2.val);
			 printlist(l2);
		}
		else
		{
			System.out.println("prev"+prev.val);
			l2= rev(slow.next);
			System.out.println("l2"+l2.val);
			
			printlist(l2);
		}
		
		System.out.println(palincheck(l1,l2));
	
		
		return palincheck(l1,l2);
	}

	private static boolean palincheck(linkedlist l1, linkedlist l2) {
		
		if(l2==null || l1==null)
		return false;
		
		while(l2!=null)
		{
			if(l1.val==l2.val)
			{
				l1=l1.next;
				l2=l2.next;

			}
			else
			{
				return false;
			}
		}
		
		
		return true;
	}

	private static linkedlist rev(linkedlist head) {
		
		if(head==null)
		return null;
		
		linkedlist prev=null;
		
		linkedlist curr=head;
		
		while(curr!=null)
		{
			linkedlist next = curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		return prev;
	}
	
private static void printlist(linkedlist l1) {
		
		while(l1!=null)
		{
			System.out.print("=>"+l1.val);
			l1=l1.next;
		}
	}
	
}
