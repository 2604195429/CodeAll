package day09;

/**
 * 守护线程
 * 
 * @author 张新华
 *
 */
public class ThreadDemo8 {
	public static void main(String[] args) {
		Thread rose = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("I jump");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread jack = new Thread() {
			@Override
			public void run() {
				for (int i = 0;; i++) {
					System.out.println("you jump！i jump");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		jack.setDaemon(true);
		rose.start();
		jack.start();

		while (true)
			;
	}
}
