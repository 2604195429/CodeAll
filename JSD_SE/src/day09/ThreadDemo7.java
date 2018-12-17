package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 线程sleep阻塞
 * 
 * @author 张新华
 *
 */
public class ThreadDemo7 {
	public static void main(String[] args) {
		// while (true) {
		// System.out.println("你好");
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// 完成电子表
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
