package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * boolean contains（E e） 判断当前集合是否有给定元素
 * 
 * @author 张新华
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
		 * 集合判断是否包含根据元素的equals方法比较 ，只要集合中有元素与给定元素equals相同，就是true
		 */
		Point p = new Point(22, 4);
		boolean contains = c.contains(p);
		System.out.println("是否包含p对象" + contains);
	}
}
