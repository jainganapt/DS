package ObserverPattern;

public class MessageSubscriberTwo implements Observer {
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

}
