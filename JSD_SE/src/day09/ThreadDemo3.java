package day09;

/**
 * ʹ�������ڲ�������ɷ�ʽһ�ͷ�ʽ��
 * 
 * @author ���»�
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
