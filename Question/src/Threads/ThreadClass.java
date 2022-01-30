package Threads;

public class ThreadClass extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("child method executed by main thread"+currentThread().getId());

	}
	
	public static void main(String arg[])
	{
		ThreadClass a = new ThreadClass();
		a.start();
		//a.start(); java.lang.IllegalThreadStateException
		//a.run();
		Thread t1 = new Thread(new RunnableThread(), "T1");
		t1.start();
		System.out.println("Main method executed by main thread"+currentThread().getId());
		
		Thread t2 = new Thread(new Runnable(){
		    @Override
		    public void run() {
		    	System.out.println("adasdas"+currentThread().getId());
		    }
		});
		
		Thread t = new Thread(()-> {System.out.println();});
		
		t.setPriority(1);
		
		
		t2.start();
		
		
	}

}
