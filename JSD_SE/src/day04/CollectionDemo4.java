package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		// 只能添加String类型的元素了
		c.add("3");
		c.add("3");
		c.add("3");
		c.add("3");
		c.add("3");
		// 遍历集合
		for (String str : c) {
			System.out.println(str);
		}
		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}
