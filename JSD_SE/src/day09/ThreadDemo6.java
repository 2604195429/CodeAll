package day09;

/**
 * �߳����ȼ�
 * 
 * @author ���»�
 *
 */
public class ThreadDemo6 {
	public static void main(String[] args) {
		Thread min = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("min");
				}
			}
		};
		Thread norm = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("norm");
				}
			}
		};
		Thread max = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("max");
				}
			}
		};
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(10);
		min.start();
		max.start();
		norm.start();
	}
}
