package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 
 * @author 张新华
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			Runnable runn = new Runnable() {
				@Override
				public void run() {
					Thread t = Thread.currentThread();
					System.out.println(t + "开始");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("线程被中断了");
					}
					System.out.println(t + "结束");
				}
			};

			pool.execute(runn);
		}

		// pool.shutdown();
		pool.shutdownNow();
		System.out.println("停止线程");
	}
}
