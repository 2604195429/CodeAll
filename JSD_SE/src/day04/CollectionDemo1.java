package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * 删除集合元素
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
		 * boolean remove(E e) 从集合删除元素，如果成功返回true
		 * 只删除第一个与equals比较相同的
		 */
		c.remove(p);
		System.out.println(c);
	}
}
