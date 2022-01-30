package ObserverPattern;

public class MessageSubscriberThree implements Observer {
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

}
