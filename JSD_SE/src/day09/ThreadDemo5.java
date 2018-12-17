package day09;

/**
 * 获取线程相关信息的方法
 * 
 * @author 张新华
 *
 */
public class ThreadDemo5 {
	public static void main(String[] args) {
		// 获取main方法的线程
		Thread t = Thread.currentThread();
		long id = t.getId();
		System.out.println(id);
	}
}
