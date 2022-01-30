package JavaArray30;

class Msg {

	private String m1;

	Msg(String m) {
		this.m1 = m;
	}

	public String getM1() {
		return m1;
	}

	public void setM1(String m1) {
		this.m1 = m1;
	}

}

public class ProducerConsumer implements Runnable {

	private Msg m1;

	public Msg getM1() {
		return m1;
	}

	public void setM1(Msg m1) {
		this.m1 = m1;
	}

	ProducerConsumer(Msg m2) {
		this.m1 = m2;
	}

	@Override
	public void run() {

		System.out.println("ProducerConsumer");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (m1) {

			System.out.println("ProducerConsumer have the lock");

			m1.setM1("msg set");
			m1.notify();

		}

	}

	public static void main(String arg[]) {

		Msg m3 = new Msg("hello there");

		ProducerConsumer p1 = new ProducerConsumer(m3);
		Consumer c1 = new Consumer(m3);

		new Thread(p1, "Producer").start();
		new Thread(c1, "Cosumer").start();

	}

}

class Consumer implements Runnable {

	private Msg m2;

	Consumer(Msg m2) {
		this.m2 = m2;
	}

	public Msg getM2() {
		return m2;
	}

	public void setM2(Msg m2) {
		this.m2 = m2;
	}

	@Override
	public void run() {

		synchronized (m2) {
			try {
				System.out.println("Consumer got the lock");
				m2.wait();
				Thread.sleep(5000);
				System.out.println("Consumer got the lock back");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("got message:" + m2.getM1());

		}

	}

}
