package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo2 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*
		 * �������ڱ�ʾ2012-03-23 13:32:02
		 */
		calendar.set(Calendar.YEAR, 2012);
		// ������ 0��ʾ1�� 11��ʾ12�� ������Calendar��װ�ĳ���
		calendar.set(Calendar.MONTH, 03 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, 23);
		calendar.set(Calendar.HOUR_OF_DAY, 13);
		calendar.set(Calendar.MINUTE, 32);
		calendar.set(Calendar.SECOND, 02);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
	}

}
