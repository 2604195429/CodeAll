package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * ɾ������Ԫ��
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1, 3));
		c.add(new Point(2, 3));
		c.add(new Point(3, 3));
		System.out.println(c);
		Point p = new Point(3, 3);
		/*
		 * boolean remove(E e) �Ӽ���ɾ��Ԫ�أ�����ɹ�����true
		 * ֻɾ����һ����equals�Ƚ���ͬ��
		 */
		c.remove(p);
		System.out.println(c);
	}
}
