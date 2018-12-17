package day10;

/**
 * ��̬ͬ��
 * 
 * @author ���»�
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Foo.dosome();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				Foo.dosome();
			}
		};
		t1.start();
		t2.start();
	}

}

class Foo {
	public synchronized static void dosome() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + "��ʼִ��dosome");
			Thread.sleep(2000);
			System.out.println(t.getName() + "����ִ��dosome");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
