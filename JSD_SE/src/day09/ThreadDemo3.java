package day09;

/**
 * 使用匿名内部类来完成方式一和方式二
 * 
 * @author 张新华
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("fafa");
			}
		};
		t1.start();

		new Thread(new Runnable() {
			@Override
			public void run() {

			}
		}).start();

	}
}
