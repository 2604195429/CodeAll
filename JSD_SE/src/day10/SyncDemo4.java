package day10;

/**
 * »¥³âËø
 * 
 * @author ÕÅÐÂ»ª
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		final Boo b = new Boo();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				b.methodA();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				b.methodA();
			}
		};
		t1.start();
		t2.start();
	}
}

class Boo {
	public synchronized void methodA() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + "faf1");
			Thread.sleep(2000);
			System.out.println(t.getName() + "faf2");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public synchronized void methodB() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + "faf1");
			Thread.sleep(2000);
			System.out.println(t.getName() + "faf2");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
