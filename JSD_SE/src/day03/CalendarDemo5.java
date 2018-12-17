package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Calendar�м���ʱ��ķ��� void add(int field,int value) ��ָ����ʱ��������ϸ�����ֵ������Ǹ������ȥ
 * 
 * @author ���»�
 *
 */
public class CalendarDemo5 {
	public static void main(String[] args) {
		/*
		 * �鿴3��2����01���Ժ������
		 */
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 3);
		calendar.add(Calendar.MONTH, 2);
		// �ӵ��춼�����е��죬���ܿ���
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		// �鿴5Сʱ��ǰ
		calendar.add(Calendar.HOUR_OF_DAY, -5);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
	}
}
