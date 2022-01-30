package Trickey;

import Threads.Message;

public class ProducerCon implements Runnable {

	private Message msg;

	ProducerCon(Message m1) {
		this.msg = m1;

	}

	@Override
	public void run() {

		synchronized (msg) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("ProducerCon done with work");
			msg.setMsg("jain");
			msg.notify();

		}

	}
	
	public static void main(String arg[])
	{
		 Message m1  = new Message("abc");
		 
		 ProducerCon p1 = new ProducerCon(m1);
		 
		 consume1 c1 = new consume1(m1);
		
		 new Thread(c1, "c1").start();
		 new Thread(p1, "p1").start();
		
		 
	}
}

class consume1 implements Runnable {

	private Message msg;

	public Message getMsg() {
		return msg;
	}
	
	consume1(Message m1)
	{
		msg=m1;
	}

	public void setMsg(Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		
		synchronized (msg) {
			
			System.out.println("Consume got  the lock");
			try {
				msg.wait();
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
			
			
			System.out.println(msg.getMsg());
		}

	}

}
