package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序自定义类型元素的集合
 */
public class SortListDemo1 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(1, 3));
		list.add(new Point(2, 3));
		list.add(new Point(32, 3));
		list.add(new Point(4, 3));
		System.out.println(list);
		/*
		 * sort方法要求集合元素必须实现Comparable接口 该接口用于规定实现类是可以比较的
		 */
		Collections.sort(list);
		System.out.println(list);

	}
}
