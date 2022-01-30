package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class fact implements Callable<Integer> {
	
	private Integer number;

	fact(Integer a) {
		this.number = a;
	}

	@Override
	public Integer call() throws Exception {

		int res = 1;

		if (number == 0 || number == 1) {
			return 1;
		} else {
			for (int i = 2; i < number; i++) {
				res = res * i;
				 TimeUnit.MILLISECONDS.sleep(20);
			}
		}

		return res;

	}

}

public class CalllableExample {

	public static void main(String arg[]) throws InterruptedException, ExecutionException {

		ThreadPoolExecutor t1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

		List<Future<Integer>> res = new ArrayList<Future<Integer>>();

		Random random = new Random();

		for (int i = 0; i < 4; i++) {
			int num = random.nextInt(100);
			System.out.println("num" + num);

			fact f1 = new fact(num);
			res.add(t1.submit(f1));

		}

		TimeUnit.MILLISECONDS.sleep(1100);
		System.out.println("sleep");

		for (Future<Integer> r1 : res) {
			System.out.println(r1.get());
		}

		t1.shutdown();
	}

}
