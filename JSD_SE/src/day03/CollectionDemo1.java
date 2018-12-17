package day03;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e) 向集合中添加元素。 当元素添加成功返回true，否则返回false
		 */
		c.add("32");
		c.add("32");
		c.add("32");
		c.add("32");
		System.out.println(c);
		/*
		 * int size() 返回集合元素的个数
		 */
		System.out.println(c.size());
		/*
		 * boolean isEmpty() 判断当前集合是否为空
		 * 
		 */
		System.out.println(c.isEmpty());
		/*
		 * void clear() 清除集合元素
		 */
		c.clear();
		System.out.println(c.isEmpty());
	}

}
