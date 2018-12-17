package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * 
 * @author ���»�
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
					System.out.println(t + "��ʼ");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("�̱߳��ж���");
					}
					System.out.println(t + "����");
				}
			};

			pool.execute(runn);
		}

		// pool.shutdown();
		pool.shutdownNow();
		System.out.println("ֹͣ�߳�");
	}
}
