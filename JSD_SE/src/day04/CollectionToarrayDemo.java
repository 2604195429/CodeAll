package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����תΪ����
 * 
 * @author ���»�
 *
 */
public class CollectionToarrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("132");
		c.add("232");
		c.add("332");
		c.add("432");
		// �����ṩ��һ������toArray�����Խ�����תΪһ������
		// Object[] o = c.toArray();
		/*
		 * ��������������ã�������Դ�ż�������Ԫ�أ���ʹ�ø�����
		 * ������Լ�����һ�����������ͬ���͵�����
		 */
		String[] array = c.toArray(new String[c.size()]);
		for (String str : array) {
			System.out.println(str);
		}
	}
}
