package day09;

/**
 * 第一种创建线程的方式 继承Thread并重写run方法来定义线程要执行的任务。
 * 
 * @author 张新华
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
			System.out.println("你是谁");
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("我是2");
		}
	}
}
