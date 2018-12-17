package day09;

/**
 * 获取当前方法的线程
 * 
 * @author 张新华
 *
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println(main);
	}
}
