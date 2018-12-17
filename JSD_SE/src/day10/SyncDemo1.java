package day10;

/**
 * ���̲߳�������ͬһ��Դʵʱ�����γɡ������������߳��л��̲߳�ȷ��������ִ�д���˳����ң�����ʱ����ϵͳ̱��
 * 
 * @author ���»�
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
			throw new RuntimeException("û�ж�����");
		}
		Thread.yield();
		return beans--;
	}
}