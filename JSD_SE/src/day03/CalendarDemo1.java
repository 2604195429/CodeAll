package day03;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
	public static void main(String[] args) {
		/*
		 * ʹ��Calendar�ľ�̬��������ʵ���� �÷�������ݵ�ǰϵͳ��������һ��ʵ����ͨ���Ǹ�������� Ĭ�ϴ���������ʵ����ʾ��ǰϵͳʱ��
		 */
		Calendar calendar = Calendar.getInstance();
		/*
		 * toString()����ֱ�ӷ�Ӧ��ʾ������
		 */
		System.out.println(calendar);
		/*
		 * Calendar->Date Date getTime() calendar�ṩ�ķ���getTime()
		 * �÷����Ļ�һ��Date���󣬸�Date��ʾ��ʱ�����Calendar��ʾ��ʱ��
		 */
		Date date = calendar.getTime();
		// ��ʾ�������ʱ��
		date.setTime(date.getTime() + 1000l * 60 * 60 * 24);
		/*
		 * Date->Calendar void setTime(Date date)
		 * Calendar��getTime��������ʹCalendar��ʾ������Date��ʾ��ʱ��
		 */
		calendar.setTime(date);
		System.out.println(calendar);
	}
}
