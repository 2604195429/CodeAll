package day03;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		/*
		 * 使用默认构造方法创建Date，表示当前系统时间
		 */
		Date now = new Date();
		/*
		 * Date重写了toString（）方法，表示当前系统时间，格式： Mon Mar 12 15:51:37 CST 2018 对非英语地区不太友好
		 */
		System.out.println(now);
		/*
		 * Date的大部分方法建议不再使用了
		 */
		now.getYear();
		/*
		 * 获取Date内部维护的long值
		 */
		long time = now.getTime();
		System.out.println(time);
		// 明天这一刻的值
		time += 24 * 60 * 60 * 1000;
		// void setTime(long) 设置一个long让它表示Date的时间
		now.setTime(time);
		System.out.println(now);
	}

}
