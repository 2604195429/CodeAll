package day09;

/**
 * ��ȡ�߳������Ϣ�ķ���
 * 
 * @author ���»�
 *
 */
public class ThreadDemo5 {
	public static void main(String[] args) {
		// ��ȡmain�������߳�
		Thread t = Thread.currentThread();
		long id = t.getId();
		System.out.println(id);
	}
}
