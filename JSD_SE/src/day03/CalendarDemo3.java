package day03;

import java.util.Calendar;

public class CalendarDemo3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * int get(int field) ��ȡ��Ӧʱ�������ֵ
		 */

		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int month = calendar.get(Calendar.MONTH) + 1;
		System.out.println(month);
		// �鿴���������ڼ�
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(week == 1 ? "7" : week - 1);
		String[] strs = new String[] { "��", "һ", "��", "��", "��", "��", "��", };
		System.out.println("��" + strs[week - 1]);
		// ������Ϊֹ�����Ѿ���ȥ��������
		int over = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(over);
	}

}
