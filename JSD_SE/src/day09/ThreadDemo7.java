package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �߳�sleep����
 * 
 * @author ���»�
 *
 */
public class ThreadDemo7 {
	public static void main(String[] args) {
		// while (true) {
		// System.out.println("���");
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// ��ɵ��ӱ�
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		while (true) {
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
