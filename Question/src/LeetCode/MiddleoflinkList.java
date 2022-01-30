package LeetCode;

public class MiddleoflinkList {
	
	public static void main(String arg[])
	{
		Link11 l = new Link11(1);
		l.next = new Link11(2);
		l.next.next = new Link11(3);
		l.next.next.next = new Link11(4);
		l.next.next.next.next = new Link11(5);
		l.next.next.next.next.next = new Link11(6);
		
		  printlink(l);
		  
		  middleNode(l);
	}

	private static void middleNode(Link11 l) {
		Link11 fast=l;
		Link11 slow=l;
		
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		
		System.out.println("");
		System.out.println("slow"+slow.val);
		
	}

	private static void printlink(Link11 l) {
		
		while(l!=null)
		{
			System.out.print("=>"+l.val);
			l=l.next;
		}
		
	}
	
     

}

class Link11{
	int val;
	Link11 next;
	
	Link11(int a)
	{
		val=a;
	}
}