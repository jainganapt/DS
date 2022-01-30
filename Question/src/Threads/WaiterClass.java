package Threads;

public class WaiterClass implements Runnable {

	private Message msg;

	public WaiterClass(Message m) {
		this.msg = m;
	}

	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		synchronized (msg) {
			System.out.println("WaiterClass :name" + name);
			System.out.println(name + "waiter" + System.currentTimeMillis());
			try {
				Thread.sleep(5000);
				msg.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(name + "waiter" + System.currentTimeMillis());
			System.out.println(name + " processed: " + msg.getMsg());
		}

	}
	
	public static void main(String arg[])
	{
		    Message msg = new Message("process it");
		    WaiterClass waiter = new WaiterClass(msg);
	        new Thread(waiter,"waiter").start();
	        WaiterClass waiter1 = new WaiterClass(msg);
	        new Thread(waiter1, "waiter1").start();
	        
	        Notifier notifier = new Notifier(msg);
	        new Thread(notifier, "notifier").start();
	        System.out.println("All the threads are started");
	}

}

class Notifier implements Runnable {

	private Message msg;

	public Notifier(Message m) {
		this.msg = m;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		System.out.println("Notifier:name" + name);

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (msg) {
			System.out.println("got the lockk");
			msg.setMsg(name + "done");
			//msg.notify();
			msg.notifyAll();
		}

	}

}
