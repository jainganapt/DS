package Threads;

class msg {

	private String m;

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}

	msg(String m2) {
		this.m = m2;
	}

}

public class NotifierClass implements Runnable {

	private msg m1;

	NotifierClass(msg m2) {
		this.m1 = m2;
	}

	public msg getM1() {
		return m1;
	}

	public void setM1(msg m1) {
		this.m1 = m1;
	}

	@Override
	public void run() {

		System.out.println("current thread" + Thread.currentThread().getName());

	

			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (m1) {
			m1.setM("notifier set the message");
			m1.notifyAll();

		}
			System.out.println("notifier thread completed" + Thread.currentThread().getName());	

	}
	
	public static void main(String arg[])
	{
		msg m1 = new msg("process it ");
		
		NotifierClass n1 = new NotifierClass(m1);
		waiter w2 = new waiter(m1);
		waiter w1 = new waiter(m1);
	
		new Thread(w2,"waiter 2 ").start();
		
		new Thread(w1,"waiter 1 ").start();
		
		new Thread(n1,"notifier 1 ").start();
		

	}

}

class waiter implements Runnable{

	private msg m2;
	
	public msg getM2() {
		return m2;
	}

	public void setM2(msg m2) {
		this.m2 = m2;
	}

	waiter(msg m3)
	{
		this.m2=m3;
	}
	
	@Override
	public void run() {
		
		
			
			System.out.println("current thread" + Thread.currentThread().getName());
			
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (m2) {
			try {
				System.out.println("current thread in sync " + Thread.currentThread().getName());
				m2.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(m2.getM());
		}
		
	}
	
}
