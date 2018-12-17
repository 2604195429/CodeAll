package day10;

/**
 * 同步块
 * 
 * @author 张新华
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		final Shop shop = new Shop();
		// final Shop shop2 = new Shop();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				shop.buy();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}

class Shop {
	public void buy() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + "开始挑衣服");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {
			System.out.println(t.getName() + "开始试衣服");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(t.getName() + "结账离开");

	}
}
