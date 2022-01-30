package Threads;

public class sync {

	private final Object lock = new Object();

	public void demoMethod0() {
		synchronized (lock) {
			// other thread safe code
		}
	}

	public synchronized void demoMethod() {
	}

	public void demoMethod1() {
		synchronized (this) {
			// other thread safe code
		}
	}
	
	public void demoClasssMethod()
    {
        //Acquire lock on .class reference
        synchronized (sync.class)
        {
            //other thread safe code
        }
    }
	
	public static void main(String arg[])
	{
		
	}

}
