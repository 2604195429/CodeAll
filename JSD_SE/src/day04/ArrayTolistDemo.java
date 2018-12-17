package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合 转换只能转list集合 转set可能丢失元素
 */
public class ArrayTolistDemo {
	public static void main(String[] args) {
		String[] array = new String[] { "1", "2", "3", "4" };
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		/*
		 * 向集合添加一个元素
		 * 
		 * 下面代码抛出异常 原因该集合由数组转过来，该集合表示原来的数组，对该集合的操作，就是对原集合的操作 那么添加元素导致原数组扩容，就不能表示原来的数组了
		 * 所以不允许向集合添加元素
		 */
		// list.add("3");
		// System.out.println(list);

		list.set(2, "32");
		System.out.println(list);
		for (String str : array) {
			System.out.println(str);
		}
		/*
		 * 若想增删
		 */
		// List<String> list1 = new ArrayList<String>();
		// list1.addAll(list);
		/*
		 * 复制构造器
		 */
		List<String> list1 = new ArrayList<String>(list);
		list1.add("3");
		System.out.println(list1);
	}
}
