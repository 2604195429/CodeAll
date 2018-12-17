package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		// 获取当前集合的迭代器
		Iterator it = c.iterator();
		/*
		 * boolean hasNest() 问的过程 该方法判断集合中是否还有元素可以取出
		 * 
		 * E next() 取得过程 获取集合中下一个元素
		 */
		while (it.hasNext()) {
			String str = (String) it.next();
			if ("#".equals(str)) {
				/*
				 * 使用迭代器时，不要使用集合的增删，否则会发生异常
				 */
				// c.remove(str);
				/*
				 * 迭代器提供的remove方法删除取出的元素
				 */
				it.remove();
			}
			System.out.println(str);
		}
		System.out.println(c);
	}
}
