package JavaArray30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Mycallable implements Callable<Integer> {

	private Integer number;

	Mycallable(int a) {
		this.number = a;
	}

	@Override
	public Integer call() throws Exception {

		int res = 1;

		if (number <= 1)
			return number;
		else {
			for (int i = 2; i <= number; i++) {
				res = res * i;
				TimeUnit.MILLISECONDS.sleep(20);
			}
		}

		return res;
	}

	public static void main(String arg[]) {
		ThreadPoolExecutor t1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

		List<Future<Integer>> res = new ArrayList<Future<Integer>>();

		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			int count =random.nextInt(10);
			System.out.println("count"+count);
			Mycallable m1 = new Mycallable(count);
			res.add(t1.submit(m1));

		}

		System.out.println("sleep");

		for (int i = 0; i < res.size(); i++) {
			try {
				if (res.get(i).get() != null) {
					System.out.println("=>" + res.get(i).get());
				}
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		System.out.println("finished =>" +t1.isShutdown());
		
		t1.shutdownNow();
		
		System.out.println("finished =>" +t1.isShutdown());
		

	}

}
