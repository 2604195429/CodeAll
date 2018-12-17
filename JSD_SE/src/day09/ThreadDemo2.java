package day09;

/**
 * 第二种创建线程
 * 
 * @author 张新华
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable1());
		Thread t2 = new Thread(new MyRunnable2());
		t1.start();
		t2.start();
	}
}
//任务
class MyRunnable1 implements Runnable {
	@Override
	public void run() {
		System.out.println("fafa");
	}
}

class MyRunnable2 implements Runnable {
	@Override
	public void run() {
		System.out.println("fafa");
	}
}
