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
		 * 新循环就是迭代器
		 * 不是新语法，而是编译器认可的
		 * 不能通过集合方法删除元素
		 */
		for (Object o : c) {
			String str = (String) o;
			System.out.println(str);
		}
	}
}
