package day03;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		/*
		 * ʹ��Ĭ�Ϲ��췽������Date����ʾ��ǰϵͳʱ��
		 */
		Date now = new Date();
		/*
		 * Date��д��toString������������ʾ��ǰϵͳʱ�䣬��ʽ�� Mon Mar 12 15:51:37 CST 2018 �Է�Ӣ�������̫�Ѻ�
		 */
		System.out.println(now);
		/*
		 * Date�Ĵ󲿷ַ������鲻��ʹ����
		 */
		now.getYear();
		/*
		 * ��ȡDate�ڲ�ά����longֵ
		 */
		long time = now.getTime();
		System.out.println(time);
		// ������һ�̵�ֵ
		time += 24 * 60 * 60 * 1000;
		// void setTime(long) ����һ��long������ʾDate��ʱ��
		now.setTime(time);
		System.out.println(now);
	}

}
