package day03;

import java.util.Calendar;

/**
 * 获取某个时间分量所允许的最大值
 * 
 * @author 张新华
 *
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		// 这个月有多少天
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		// 查看二月多少天
		calendar.set(Calendar.MONTH, 1);
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		// 今年共多少天
		days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);
	}
}
