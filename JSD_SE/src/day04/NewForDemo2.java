package day04;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("one2");
		c.add("on2e");
		c.add("o1ne");
		c.add("o2ne");
		System.out.println(c);
		/*
		 * ��ѭ�����ǵ�����
		 * �������﷨�����Ǳ������Ͽɵ�
		 * ����ͨ�����Ϸ���ɾ��Ԫ��
		 */
		for (Object o : c) {
			String str = (String) o;
			System.out.println(str);
		}
	}
}
