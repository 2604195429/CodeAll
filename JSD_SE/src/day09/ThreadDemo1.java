package day09;

/**
 * ��һ�ִ����̵߳ķ�ʽ �̳�Thread����дrun�����������߳�Ҫִ�е�����
 * 
 * @author ���»�
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		t1.start();
		t2.start();
	}
}

class MyThread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("����˭");
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("����2");
		}
	}
}
