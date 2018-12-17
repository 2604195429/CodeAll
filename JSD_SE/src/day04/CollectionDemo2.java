package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合批量操作
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c++");
		c1.add(".net");
		c1.add("linux");
		System.out.println(c1);
		Collection c2 = new HashSet();
		c2.add("android");
		c2.add("ios");
		c2.add("linux");
		c2.add("linux");// 返回false，相同
		System.out.println(c2);
		/*
		 * 取并集 boolean addAll(Collection c) 将给定集合中所有元素添加到当前集合中 添加后只要当前集合数量发生变化，则返回true
		 */
		boolean flag = c1.addAll(c2);
		System.out.println(c1);
		System.out.println(flag);

		/*
		 * boolean containsAll(Collection c) 判断当前集合是否包含给定集合的所有元素
		 */
		System.out.println(c2.containsAll(c1));
	}
}
