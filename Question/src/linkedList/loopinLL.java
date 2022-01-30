package linkedList;

public class loopinLL {
	
	public static void main(String arg[])
	{
		  linkedlist l1 = new linkedlist(1);
		
		  l1.next = new linkedlist(2); 
		  l1.next.next = new linkedlist(3);
		  l1.next.next.next = new linkedlist(4); 
			  l1.next.next.next.next = new linkedlist(5); 
			  l1.next.next.next.next.next = new linkedlist(6);
		 
		//create loop
		l1.next.next.next.next=l1.next.next;
		
		
		System.out.println(checkloop(l1));
		
		//removeloop(l1);
		//remove loop
		
		
		printlist(removeloop(l1));
		
		
	}
	
private static linkedlist removeloop(linkedlist l1) {
	
	if(l1==null || l1.next==null)
		return l1;
	
	linkedlist fast=l1;
	linkedlist slow=l1.next;
	
	while(fast!=null && fast.next!=null)
	{
		if(slow==fast)
		break;
		
		slow=slow.next;
		fast=fast.next.next;
	}
	
	System.out.println("foundloop=============>");
	
	if (slow == fast) {
		
		slow = l1;
		
		System.out.println("hello=>" + slow.val);

		System.out.println("hello2=>" + fast.val);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (slow.next != fast.next) {
			System.out.println("foundloop:::=>" + slow.val);

			System.out.println("foundloop::=>" + fast.val);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			slow = slow.next;
			fast = fast.next;
		}
		 fast.next=null;
	}
	
	
	   
	return l1;
		
	}
	
	private static boolean checkloop(linkedlist l1) {
		
		if(l1==null && l1.next==null)
			return false;
		linkedlist fast=l1;
		linkedlist slow=l1.next;
		
		while(fast!=null && fast.next!=null)
		{
			if(slow==fast)
			return true;
			
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return false;
	}

	private static void printlist(linkedlist l1) {
		
		while(l1!=null)
		{
			System.out.print("=>"+l1.val);
			l1=l1.next;
		}
	}

}
