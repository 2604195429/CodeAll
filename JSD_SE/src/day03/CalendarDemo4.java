package day03;

import java.util.Calendar;

/**
 * ��ȡĳ��ʱ���������������ֵ
 * 
 * @author ���»�
 *
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		// ������ж�����
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		// �鿴���¶�����
		calendar.set(Calendar.MONTH, 1);
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		// ���깲������
		days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);
	}
}
