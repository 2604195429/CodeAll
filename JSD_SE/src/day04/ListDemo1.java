package day04;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		/*
		 * E set(int index,E e) 将给定元素设置在给定位置上 返回值为原先元素。所有事替换元素操作
		 */
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		String old = list.set(2, "5");
		System.out.println(list);
		System.out.println(old);
		// list.set(4, "23");//这么写会下标越界
		/*
		 * E get（int index） 获取给定下标对应的元素
		 */
		String str = list.get(2);
		System.out.println(str);
	}

}
