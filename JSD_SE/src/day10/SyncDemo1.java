package day10;

/**
 * 多线程并发访问同一资源实时，会形成“抢”的现象，线程切换线程不确定，可能执行代码顺序混乱，严重时导致系统瘫痪
 * 
 * @author 张新华
 *
 */
public class SyncDemo1 {
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while (true) {
					int b = table.getBean();
					Thread.yield();
					System.out.println(getName() + ":" + b);
				}
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				while (true) {
					int b = table.getBean();
					Thread.yield();
					System.out.println(getName() + ":" + b);
				}
			}
		};
		t1.start();
		t2.start();
	}
}

class Table {
	private int beans = 20;

	public synchronized int getBean() {
		if (beans == 0) {
			throw new RuntimeException("没有豆子了");
		}
		Thread.yield();
		return beans--;
	}
}