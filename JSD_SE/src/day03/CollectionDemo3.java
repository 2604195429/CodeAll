package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * ���ϴ��Ԫ�أ���Ԫ�ص����ã���ַ��
 * 
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Point p = new Point(32, 2);
		System.out.println(p);
		c.add(p);
		System.out.println(c);
		p.setX(2);
		System.out.println(p);
		System.out.println(c);
	}
}
