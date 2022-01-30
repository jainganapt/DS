package Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadIssue implements Runnable {

	//private int count;
	
	private AtomicInteger count = new AtomicInteger();

	public int getCount() {
		return this.count.get();
	}

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			processSomething(i);
			//c
			count.incrementAndGet();
		}

	}

	private void processSomething(int i) {
		// processing some job
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String arg[]) throws InterruptedException {
		ThreadIssue t1 = new ThreadIssue();
		Thread t3 =new Thread(t1, "t1");
		Thread t4=new Thread(t1, "t2");
		
		t3.start();
		t4.start();
		
		t3.join();
		t4.join();

		
		System.out.println(t1.getCount());
	}

}
