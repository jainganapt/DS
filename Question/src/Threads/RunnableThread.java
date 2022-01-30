package Threads;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Run-->"+Thread.currentThread().getName());

	}
	
	public static void main(String arg[])
	{
		
	//	Thread t = new Thread();
		RunnableThread a = new RunnableThread();
		Thread t1 = new Thread(new RunnableThread(), "T1");
		a.run();
		t1.start();//it will create new thread task inside run will be excuted by run method
		t1.run();
		System.out.println("thead--->"+Thread.currentThread().getName());
	}
}
