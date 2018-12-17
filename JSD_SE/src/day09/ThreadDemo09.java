package day09;

import javax.management.RuntimeErrorException;

/**
 * void join
 * 
 * @author 张新华
 *
 */
public class ThreadDemo09 {
	// 表示图片是否下载完毕
	public static boolean isFinish = false;

	public static void main(String[] args) {
		final Thread download = new Thread() {
			@Override
			public void run() {
				System.out.println("图片开始下载");
				for (int i = 1; i <= 100; i++) {
					System.out.println("已下载：" + i);
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("下载完毕");
				isFinish = true;
			}
		};
		Thread show = new Thread() {
			@Override
			public void run() {
				System.out.println("show:开始显示图片");
				/*
				 * 先等待download把图片下载完毕
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (!isFinish) {
					throw new RuntimeException("图片没有下好");
				}
				System.out.println("show: 显示完毕");
			}
		};
		download.start();
		show.start();
	}
}
