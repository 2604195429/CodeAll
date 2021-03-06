package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 取子集 List SubList（int start，int end） 获取当前集合中指定范围的子集，同样是含头不含尾
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		// 获取3-7
		List<Integer> subList = list.subList(3, 8);
		// 扩大十倍
		for (int i = 0; i < subList.size(); i++) {
			subList.set(i, subList.get(i) * 10);
		}
		System.out.println(subList);
		/*
		 * 对于子集的修改，就相当于修改了原集合的对应的内容
		 */
		System.out.println(list);
		/*
		 * 删除集合2-8的元素
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}
