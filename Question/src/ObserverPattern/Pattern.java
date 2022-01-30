package ObserverPattern;

public class Pattern {
	
	public static void main(String arg[])
	{
		    MessageSubscriberOne s1 = new MessageSubscriberOne();
	        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
	        MessageSubscriberThree s3 = new MessageSubscriberThree();
	         
	        MessaePublish p = new MessaePublish();
	        
	        p.attach(s1);
	        p.attach(s2);
	        
	        Message m = new Message("asdadasdvdsd");
			p.notifyUpdate(m);
	         
	}

}
