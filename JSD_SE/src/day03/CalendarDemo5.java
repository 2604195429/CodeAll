package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Calendar中计算时间的方法 void add(int field,int value) 给指定的时间分量加上给定的值，如果是负数则减去
 * 
 * @author 张新华
 *
 */
public class CalendarDemo5 {
	public static void main(String[] args) {
		/*
		 * 查看3年2个月01天以后的日期
		 */
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 3);
		calendar.add(Calendar.MONTH, 2);
		// 加的天都是年中的天，可能跨年
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		// 查看5小时以前
		calendar.add(Calendar.HOUR_OF_DAY, -5);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
	}
}
