package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * list集合提供一对重载add,remove方法 void add（int index，E e） 将给定元素插到给定位置
 * 
 * E remove（int index） 删除指定位置的元素，并将其返回
 * 
 * @author 张新华
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("4");
		list.add(2, "3");
		System.out.println(list);
		String str = list.remove(2);
		System.out.println(str);
		System.out.println(list);
	}
}
