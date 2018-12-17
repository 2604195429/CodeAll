package day09;

import javax.management.RuntimeErrorException;

/**
 * void join
 * 
 * @author ���»�
 *
 */
public class ThreadDemo09 {
	// ��ʾͼƬ�Ƿ��������
	public static boolean isFinish = false;

	public static void main(String[] args) {
		final Thread download = new Thread() {
			@Override
			public void run() {
				System.out.println("ͼƬ��ʼ����");
				for (int i = 1; i <= 100; i++) {
					System.out.println("�����أ�" + i);
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("�������");
				isFinish = true;
			}
		};
		Thread show = new Thread() {
			@Override
			public void run() {
				System.out.println("show:��ʼ��ʾͼƬ");
				/*
				 * �ȵȴ�download��ͼƬ�������
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (!isFinish) {
					throw new RuntimeException("ͼƬû���º�");
				}
				System.out.println("show: ��ʾ���");
			}
		};
		download.start();
		show.start();
	}
}
