package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains��E e�� �жϵ�ǰ�����Ƿ��и���Ԫ��
 * 
 * @author ���»�
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(23, 4));
		c.add(new Point(23, 4));
		c.add(new Point(23, 4));
		System.out.println(c);
		/*
		 * �����ж��Ƿ��������Ԫ�ص�equals�����Ƚ� ��ֻҪ��������Ԫ�������Ԫ��equals��ͬ������true
		 */
		Point p = new Point(22, 4);
		boolean contains = c.contains(p);
		System.out.println("�Ƿ����p����" + contains);
	}
}
