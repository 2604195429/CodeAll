package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转为数组
 * 
 * @author 张新华
 *
 */
public class CollectionToarrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("132");
		c.add("232");
		c.add("332");
		c.add("432");
		// 集合提供了一个方法toArray，可以将集合转为一个数组
		// Object[] o = c.toArray();
		/*
		 * 若给定的数组可用（数组可以存放集合所有元素）则使用该数组
		 * 否则会自己创建一个与给定集合同类型的数组
		 */
		String[] array = c.toArray(new String[c.size()]);
		for (String str : array) {
			System.out.println(str);
		}
	}
}
