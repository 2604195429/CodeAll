package day03;

import java.util.Calendar;

public class CalendarDemo3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * int get(int field) 获取对应时间分量的值
		 */

		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int month = calendar.get(Calendar.MONTH) + 1;
		System.out.println(month);
		// 查看现在是星期几
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(week == 1 ? "7" : week - 1);
		String[] strs = new String[] { "日", "一", "二", "三", "四", "五", "六", };
		System.out.println("周" + strs[week - 1]);
		// 到今天为止今年已经过去多少天了
		int over = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(over);
	}

}
