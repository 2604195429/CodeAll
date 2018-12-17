package day03;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
	public static void main(String[] args) {
		/*
		 * 使用Calendar的静态方法创建实例， 该方法会根据当前系统地区创建一个实例，通常是格里高利历 默认创建的日历实例表示当前系统时间
		 */
		Calendar calendar = Calendar.getInstance();
		/*
		 * toString()不能直接反应表示的日期
		 */
		System.out.println(calendar);
		/*
		 * Calendar->Date Date getTime() calendar提供的方法getTime()
		 * 该方法改回一个Date对象，该Date表示的时间就是Calendar表示的时间
		 */
		Date date = calendar.getTime();
		// 表示明天这个时候
		date.setTime(date.getTime() + 1000l * 60 * 60 * 24);
		/*
		 * Date->Calendar void setTime(Date date)
		 * Calendar的getTime方法可以使Calendar表示给定的Date表示的时间
		 */
		calendar.setTime(date);
		System.out.println(calendar);
	}
}
